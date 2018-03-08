package com.example.android.sunshine;

public interface ItemMoveSwipeListener {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
