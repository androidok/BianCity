package com.putaotown.views;

import com.putaotown.tools.LogUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class AImageView extends ImageView
{

	public AImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	public AImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public AImageView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	 @SuppressWarnings("unused")
	    @Override
	    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
	        // For simple implementation, or internal size is always 0.
	        // We depend on the container to specify the layout size of
	        // our view. We can't really know what it is since we will be
	        // adding and removing different arbitrary views and do not
	        // want the layout to change as this happens.
//	        setMeasuredDimension(getDefaultSize(0, widthMeasureSpec), getDefaultSize(0, heightMeasureSpec));
	 
	        // Children are just made to fill our space.
//	        int childWidthSize = getMeasuredWidth();
//	        int childHeightSize = getMeasuredHeight();
	        //高度和宽度一样
//	        heightMeasureSpec = widthMeasureSpec = MeasureSpec.makeMeasureSpec(childWidthSize, MeasureSpec.EXACTLY);
		 	LogUtil.v("AImageView info: ", "It is called! X positon: "+this.getX());
	        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
	    }
}