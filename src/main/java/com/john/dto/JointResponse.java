package com.john.dto;

import java.util.List;

/**
 *
 */
public class JointResponse {
    private List<Integer> contextListOne;
    private List<Integer> contextListTwo;

    public JointResponse(final List<Integer> contextListOne, final List<Integer> contextListTwo) {
        this.contextListOne = contextListOne;
        this.contextListTwo = contextListTwo;
    }

    public List<Integer> getContextListOne() {
        return contextListOne;
    }

    public List<Integer> getContextListTwo() {
        return contextListTwo;
    }
}
