package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;

public class RecycleItemTouchHelper extends ItemTouchHelper.Callback{
    private static final String TAG ="RecycleItemTouchHelper" ;
    private final ItemMoveSwipeListener mListener;
    public RecycleItemTouchHelper(ItemMoveSwipeListener helperCallback) {
        mListener = helperCallback;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Log.e(TAG, "getMovementFlags: " );
        //START  右向左 END左向右 LEFT  向左 RIGHT向右  UP向上
        //如果某個值傳0，表示不觸發該操作，次數設定支持上下拖拽，支持向右滑動
        int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN; //允許上下的拖動
        int swipeFlags = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT; //只允許從右向左側滑
        return makeMovementFlags(dragFlags,swipeFlags);
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        Log.e(TAG, "onMove: " );
        mListener.onItemMove(viewHolder.getAdapterPosition(),target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        Log.e(TAG, "onSwiped: ");
        mListener.onItemDismiss(viewHolder.getAdapterPosition());
    }
    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
    }
}
