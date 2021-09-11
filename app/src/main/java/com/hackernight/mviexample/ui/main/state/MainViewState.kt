package com.hackernight.mviexample.ui.main.state

import com.hackernight.mviexample.model.BlogPost
import com.hackernight.mviexample.model.User

data class MainViewState(
    val blogPosts:List<BlogPost>?=null,
    val user: User?=null
)
