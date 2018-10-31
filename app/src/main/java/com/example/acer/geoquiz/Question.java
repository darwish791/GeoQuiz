package com.example.acer.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private int mAnswered;

    public Question(int textResId, boolean answerTrue)
    {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnswered = 0;
    }

    public int isAnswered() { return mAnswered; }

    public void setAnswered(int answered) { mAnswered = answered; }

    public int getTextResId()
    {
        return mTextResId;
    }

    public void setTextResId(int textResId)
    {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue()
    {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue)
    {
        mAnswerTrue = answerTrue;
    }
}
