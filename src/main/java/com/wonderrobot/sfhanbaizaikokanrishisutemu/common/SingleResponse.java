package com.wonderrobot.sfhanbaizaikokanrishisutemu.common;

/**
 * SingleResponse
 * @param <T>
 */
public class SingleResponse<T> extends Response {
    /**
     * Data
     */
    private T data;

    public SingleResponse() {
    }

    public static <T> SingleResponse<T> of(T data) {
        SingleResponse<T> singleResponse = new SingleResponse<T>();
        singleResponse.setSuccess(true);
        singleResponse.setData(data);
        return singleResponse;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static SingleResponse buildFailure(String errCode, String errMessage) {
        SingleResponse response = new SingleResponse();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static SingleResponse buildSuccess() {
        SingleResponse response = new SingleResponse();
        response.setSuccess(true);
        return response;
    }
}
