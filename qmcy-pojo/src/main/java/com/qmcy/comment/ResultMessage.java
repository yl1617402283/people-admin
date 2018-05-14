package com.qmcy.comment;

import java.io.Serializable;

public class ResultMessage<T> implements Serializable {

        private static final long serialVersionUID = 1L;

        /**
         * 返回码
         */
        private int code;

        /**
         * 返回消息
         */
        private String message;

        /**
         * 消息实体
         */
        private T data;

        public ResultMessage(int code, String message, T data) {
            this.code = code;
            this.message = message;
            this.data = data;
        }

        public ResultMessage(HttpCode httpCode, T data) {
            this.code = httpCode.getCode();
            this.message = httpCode.getDesc();
            this.data = data;
        }

        public void change(HttpCode httpCode){
            this.code = httpCode.getCode();
            this.message = httpCode.getDesc();
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public ResultMessage() {

        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "ResultMessage [code = " + code + ",message = " + message + ","
                    + "data = " + (null != data ? data.toString() : "") + "]";
        }
}
