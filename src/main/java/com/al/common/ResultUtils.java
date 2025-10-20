package com.al.common;


import com.al.exception.ErrorCode;
import lombok.Data;


@Data
public class ResultUtils {
    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static<T> BaseResponse<T> success(Object data)
        {
            return new BaseResponse(0, data, "ok");
        }

        /**
         * 失败
         *
         * @param errorCode
         * @return
         */
        public static BaseResponse<?> error(ErrorCode errorCode) {
            return new BaseResponse(errorCode);
        }

        /**
         * 失败
         *
         * @param errorCode
         * @return
         */
        public static BaseResponse<?> error(ErrorCode errorCode, String message) {
            return new BaseResponse(errorCode, message);
        }

        /**
         * 错误
         *
         * @param code
         * @param message
         * @return
         */
        public static  BaseResponse<?> error(int code, String message) {
                return new BaseResponse(code,null, message);
        }
}
