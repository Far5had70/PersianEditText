package ir.waspar.persianedittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class PersianEditText extends FrameLayout {

    private EditText editText;
    private ImageView imageView;


    public PersianEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView();
    }

    public PersianEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context , attrs);
    }

    public PersianEditText(Context context) {
        super(context);
        initView();
    }

    @SuppressLint("RtlHardcoded")
    private void initView(Context context , AttributeSet attrs) {
        View view = inflate(getContext(), R.layout.edit_text_persian, null);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PersianEditText, 0, 0);
        editText = view.findViewById(R.id.so_edittext);
        imageView = view.findViewById(R.id.so_imageview);
        RelativeLayout relativeLayout = view.findViewById(R.id.background_image);
        RelativeLayout relativeLayoutParent = view.findViewById(R.id.os_parent_layout);


        try {
            String Text = ta.getString(R.styleable.PersianEditText_setText);
            String Hint = ta.getString(R.styleable.PersianEditText_setHint);
            String Font = ta.getString(R.styleable.PersianEditText_typeface);
            Drawable Drawable = ta.getDrawable(R.styleable.PersianEditText_imageSrc);
            ColorStateList color = ta.getColorStateList(R.styleable.PersianEditText_textColor);
            ColorStateList imageBackground = ta.getColorStateList(R.styleable.PersianEditText_setImageBackground);
            ColorStateList strokeColor = ta.getColorStateList(R.styleable.PersianEditText_strokeColor);
            float Size = ta.getDimension(R.styleable.PersianEditText_textSize, 12);
            float Radius = ta.getDimension(R.styleable.PersianEditText_strokeRadius, 80);
            float Stroke = ta.getDimension(R.styleable.PersianEditText_strokeSize, 3);
            int gravity = ta.getInteger(R.styleable.PersianEditText_edtgravity, 3);
            int InputTypee = ta.getInteger(R.styleable.PersianEditText_edtInputType, 3);

            int strColor;
            if (strokeColor != null){
                strColor = strokeColor.getDefaultColor();
            }else {
                strColor = context.getResources().getColor(R.color.outerspace);
            }

            GradientDrawable shape = new GradientDrawable();
            shape.setShape(GradientDrawable.RECTANGLE);
            shape.setColor(Color.WHITE);
            shape.setStroke((int) Stroke, strColor);
            shape.setCornerRadius(20);
            shape.setCornerRadii(new float[] { Radius, Radius, Radius, Radius, Radius, Radius, Radius, Radius });
            relativeLayoutParent.setBackground(shape);

            GradientDrawable shape2 = new GradientDrawable();
            shape2.setShape(GradientDrawable.RECTANGLE);
            if (imageBackground != null){
                shape2.setColorFilter(imageBackground.getDefaultColor() , PorterDuff.Mode.SRC_IN);
            }else {
                shape2.setColorFilter(context.getResources().getColor(R.color.midnightgreen) , PorterDuff.Mode.SRC_IN);
            }
            shape2.setStroke((int) Stroke, strColor);
            shape2.setCornerRadius(20);
            shape2.setCornerRadii(new float[] { 0, 0, Radius, Radius, Radius, Radius, 0, 0 });
            relativeLayout.setBackground(shape2);


            editText.setText(Text);
            editText.setHint(Hint);
            if (color != null){
                editText.setTextColor(color);
            }
            editText.setTextSize(Size);
            imageView.setImageDrawable(Drawable);

            if (Font != null){
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/"+Font));
            }

            editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);



            switch (gravity){
                case 1:
                    editText.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
                    break;
                case 2:
                    editText.setGravity(Gravity.LEFT | Gravity.CENTER_VERTICAL);
                    break;
                case 3:
                    editText.setGravity(Gravity.CENTER | Gravity.CENTER_VERTICAL);
                    break;
            }

            switch (InputTypee){
                case 1:
                    editText.setInputType(InputType.TYPE_CLASS_PHONE);
                    break;
                case 2:
                    editText.setInputType(InputType.TYPE_CLASS_NUMBER);
                    break;
                case 3:
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    break;
                case 4:
                    editText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    break;
                case 5:
                    editText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_MULTI_LINE);
                    break;
            }


        } finally {
            ta.recycle();
        }
        addView(view);
    }

    private void initView() {
        View view = inflate(getContext(), R.layout.edit_text_persian, null);
        addView(view);
    }

    public void setText(String Text){
        editText.setText(Text);
    }

    public void setHint(String Text){
        editText.setHint(Text);
    }

    public void setTextColor(ColorStateList color){
        if (color != null){
            editText.setTextColor(color);
        }
    }

    public void setTextSize(float Size){
        editText.setTextSize(Size);
    }

    public void setImageDrawable(Drawable Drawable){
        imageView.setImageDrawable(Drawable);
    }

}
