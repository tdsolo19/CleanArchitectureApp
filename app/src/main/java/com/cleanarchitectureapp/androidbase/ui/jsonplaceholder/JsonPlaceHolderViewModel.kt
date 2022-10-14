package com.cleanarchitectureapp.androidbase.ui.jsonplaceholder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.cleanarchitectureapp.androidbase.base.viewmodel.BaseViewModel
import com.cleanarchitectureapp.androidbase.data.models.Post
import com.cleanarchitectureapp.androidbase.data.repositories.JsonPlaceHolderRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JsonPlaceHolderViewModel @Inject constructor(private  val jsonPlaceHolderRepository: JsonPlaceHolderRepository) : BaseViewModel() {

    private var _listPosts = MutableLiveData<List<Post>?>()
    val listPosts : LiveData<List<Post>?>
    get() = _listPosts

    override fun fetchData() {
        showLoading(true)
        parentJob = viewModelScope.launch(handler) {
            val posts = jsonPlaceHolderRepository.getAllPost()
            _listPosts.postValue(posts)
        }
        registerJobFinish()
    }

}