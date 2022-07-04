package com.jjw.ecommerce.constant;

/**
 * <h1>授权需要使用的一些常量信息</h1>
 * */
public final class AuthorityConstant {

    /** RSA 私钥, 除了授权中心以外, 不暴露给任何客户端 */
    public static final String PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWh5tYcw1EHy9jp/Sqk0Bc9ZACTMFEf+X/nm0/gBP7imtqbqHJJ6Ft8T+YdYignnKNIwO1+64DNiMG//w1Pej9FBBxmVZU+mMEYG1GwuTJiOOdzYcIFIUk3q3V/T6V9AIa1+ea6/Oje6Yu/VF9jNQQimp0ThTxP/Wj5F7QNA1gx5HG2o4UsbfPWfldsDuUygEOLl7mkpl8AFpoFQEgYvwcIvWDh0yPLrH7eb+uFnDDx4LUjTXAzx0/EEGxexKef1SO1/jR1CDml4pZpN2g6n7neptD+7dncbZn7sWaKK3F0b+ox/yHT+AyQX5zksJ4AhKBNGUrI3rviHBxcTVJd7Q/AgMBAAECggEBAIAq3Gk2JPCAwP/QTPFDyYSdDU33/oMNh07bnNd5fQoq9IS9yAEXPkr3I5fzUy63Wn+zdYBo1+QiHzbhlOPcX9nEUK/4yFo4i0B5vfGHFfhHFs8Q5U1K84bOFyNhqf1Rss0aUjhFeMAVEw1lYRJOa23d/QAkT46OT9+JHfWWrGFel/8F4kiXxyKAJrBi6yjN1kcAiT/rIvstBz/eEMCTtlF93q2wyxai1NEiG4IcYxmxdosxIbJIE1RJsS5CcpXoiDMUIsMiTQeL3z/D8eC9Lhl0GkNtmvmTa2V6eOH3ooN7CvPkTDx+9DV+gQnvpTtPYieyB8rMelVx551LpZRdkpkCgYEA6Ww022uoFi9ns67fWGKljBccjtBqqEHBJjXwvrLDwtMkz2I+9IBc/q/rZn7dbQ4GZYBlqME83C5M3NgLVa/RD8CxB9wob9/ulgo36u9m0ban0jU9BKfQrx7Y634EhVjSv6YtX9SviKDB355TpeVISv8++5DiXM02IxnFMmwiV2sCgYEApRbh5rqXCk1Be6xlO95qlHqeeeK1GkgdlUJMVca8jI0wQ7kPmW5b6IWsfKDWntWmd8qMBvYVvYY9vyCAjFU3S21aocdcoDQY6g3Cr2gXkBL1/jC1X8YleMgnAP0qxpsKZNukz17FWkcT4TTOSz+56jHzzMtwLZTRAFBEII5rT30CgYBg7nVYtPEdHVx0CmdnHbffX+2VBMl1y7B4vKeXmUafzeyYThUUlYWIoecgLginc86GMfaFSJGMYZG7l9/FGni3kO4y9GK6aoR6PA4Seo35Al/YdBE9sK6BOk8cI72e3k7OFST8iabHFvLLeMUFvBv0QOCXuQe3P+R+WQJBuRPdtwKBgDWq96sjM2DE9qm2xH4u8uTr68Lh4U/2668PC3PDFJ54c51AdwLA7p3rfsRRIRQnjmNY9CZ7L1waXM5aSY/VUBF0LkdzYPgvl33XFVgida5/i3qj6QKGjr3yC0P2CUbhNgLNqIlFXNDZVGwc14d84vpwXLpR1FjtDPiWH1+aDOadAoGACZvDaCwmB3I8m1nT1Xg5rEqfpEVq6W1fpwQ1TQBC0Y1Y33nw/1hC9cRuz5fgjkA/U79Bhz3FSbi72xbu4Xv/MEMTODYZhiKFKN5BiK+2KELjS7jla56ULkOZI7s0p0ZvKndpMABHwTRYV2h5uzht5MjGwni6iTeOOLk75YVM1L8=";

    /** 默认的 Token 超时时间, 一天 */
    public static final Integer DEFAULT_EXPIRE_DAY = 1;
}