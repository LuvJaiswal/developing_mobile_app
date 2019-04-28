package com.example.todomvvm;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.todomvvm.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final AppDatabase mdb;
    private final int mTodoId;


    public AddTaskViewModelFactory(AppDatabase mdb, int mTodoId) {
        this.mdb = mdb;
        this.mTodoId = mTodoId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AddTaskViewModel(mdb, mTodoId);
    }
}