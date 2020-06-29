package top.caoxuan.myrobot;

interface Listener {
    void onSuccess(String question, String resultString);

    void onFailed(String resultString);
}
