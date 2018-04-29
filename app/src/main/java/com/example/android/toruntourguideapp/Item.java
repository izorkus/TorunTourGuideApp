package com.example.android.toruntourguideapp;

public class Item {
    private String mItemTitle;
    private String mItemContent;
    private int mImageResId;
    private boolean mHasImage;

    public Item(String ItemTitle, String ItemContent){
        mItemTitle = ItemTitle;
        mItemContent = ItemContent;
        mHasImage = false;
    }

    public Item(String ItemTitle, String ItemContent, int ImageResId){
        mItemTitle = ItemTitle;
        mItemContent = ItemContent;
        mImageResId = ImageResId;
        mHasImage = true;
    }

    public String getItemTitle() { return mItemTitle; }

    public String getItemContent() { return mItemContent; }

    public int getImageResId() {return  mImageResId; }

    public boolean hasImage() {
        return mHasImage;
    }

    @Override
    public String toString() {
        return "Item{" +
                "mItemName='" + mItemTitle + '\'' +
                ", mItemContent" + mItemContent + '\'' +
                ", mImageResId" + mImageResId +
                ", mHasImage=" + mHasImage +
                ')';
    }
}
