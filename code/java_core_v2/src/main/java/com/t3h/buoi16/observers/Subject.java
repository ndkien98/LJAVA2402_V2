package com.t3h.buoi16.observers;

import com.t3h.buoi16.observers.model.Observer;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObservers();
}
