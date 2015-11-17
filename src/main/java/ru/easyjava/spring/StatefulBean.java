package ru.easyjava.spring;

/**
 * Simple stateful bean.
 */
public interface StatefulBean {
    /**
     * Gets bean state.
     * @return state value.
     */
    String getState();

    /**
     * Sets bean state.
     * @param state new state value.
     */
    void setState(String state);
}
