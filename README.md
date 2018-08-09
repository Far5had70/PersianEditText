# PersianEdittext

<img src="https://raw.githubusercontent.com/Far5had70/PersianEditText/master/ScreenVideo.gif" height="480" width="270">

![alt text](https://raw.githubusercontent.com/Far5had70/PersianEditText/master/Capture.png)

Simple Custom EditText for Android

# Features

Border (stroke, radius, color)

Background (color)

Icon (Drawable)

Gravity (Right, Left, Center)

InputType(Phone, Number, Text, Password, MultiLine)

TypeFace(directory: Assets/fonts/sampleFont.ttf)




# Installation

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	implementation 'com.github.Far5had70:PersianEditText:3.0.1'
	
Step 2. Add the dependency

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}



# Usage

1 - Include PersianEditText namespace to the root element :

	xmlns:PersianEditText="http://schemas.android.com/apk/res-auto"

2 - Add the PersianEditText View with custom params :

	<ir.waspar.persianedittext.PersianEditText
            android:id="@+id/persian_edit_text"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginRight="20dp"
            android:layout_marginLeft="20dp"
            android:layout_marginTop="20dp"
            PersianEditText:edtgravity="center"
            PersianEditText:edtInputType="phone"
            PersianEditText:imageSrc="@drawable/ic_profile"
            PersianEditText:setHint="تلفن همراه"
            PersianEditText:setImageBackground="@color/midnightgreen"
            PersianEditText:strokeColor="@color/black"
            PersianEditText:strokeRadius="40dp"
            PersianEditText:maxLenght="11"
            PersianEditText:strokeSize="1dp"
            PersianEditText:textColor="@color/midnightgreen"
            PersianEditText:textSize="8sp">

# FAQ

How to add new fonts ? Just Paste your font inside assets/fonts/ folder for Text fonts and add this to attr PersianEditText

	PersianEditText:typeface="bsans.ttf"


# Developed By

Farshad Asgharzadeh

For contact, shoot me an email at ferik800@gmail.com
