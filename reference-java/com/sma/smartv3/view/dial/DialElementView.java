package com.sma.smartv3.view.dial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DialElementView extends RelativeLayout {

    /* JADX INFO: renamed from: I1 */
    public boolean f55069I1;

    /* JADX INFO: renamed from: IO */
    public boolean f55070IO;
    public int Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    @tb1
    public NestedScrollView f55071OO;

    @tb1
    public ImageView OX110i;
    public int X0i1O;
    public float X100O;
    public float X11I;
    public int X11iII1O1;
    public boolean X1IX;
    public boolean XOX0O0;

    @tb1
    public TextView XX1Oi;
    public int XXO;
    public int XXX11i;
    public int iIXi1iiXI;
    public float iOiXi11II;

    @tb1
    public String iX1O1;
    public int iXiX011;
    public int iXiiiO;
    public int iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialElementView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final boolean IiI10X(float f, float f2) {
        if (XO0O10(f2)) {
            return O00(((float) this.iXiiiO) - (((float) this.XXO) + f), ((float) this.Ii1iii0) - (((float) this.O001I) + f2)) && O00(((float) this.iXiiiO) - (((float) this.XXO) + f), ((float) this.Ii1iii0) - ((((float) this.O001I) + f2) + ((float) getHeight()))) && O00(((float) this.iXiiiO) - ((((float) this.XXO) + f) + ((float) getWidth())), ((float) this.Ii1iii0) - (((float) this.O001I) + f2)) && O00(((float) this.iXiiiO) - ((f + ((float) this.XXO)) + ((float) getWidth())), ((float) this.Ii1iii0) - ((f2 + ((float) this.O001I)) + ((float) getHeight())));
        }
        return false;
    }

    public final boolean O00(float f, float f2) {
        return Math.sqrt((double) ((f * f) + (f2 * f2))) <= ((double) this.iiiO);
    }

    public final void OXO1(Context context) {
        if (this.X0i1O == 1) {
            View viewInflate = LayoutInflater.from(context).inflate(this.XXX11i, (ViewGroup) null);
            this.OX110i = (ImageView) viewInflate.findViewById(R.id.f51417iv);
            addView(viewInflate);
            return;
        }
        View viewInflate2 = LayoutInflater.from(context).inflate(this.XXX11i, (ViewGroup) null);
        ((ImageView) viewInflate2.findViewById(R.id.controlIv)).setImageResource(this.X11iII1O1);
        TextView textView = (TextView) viewInflate2.findViewById(R.id.f51423tv);
        this.XX1Oi = textView;
        if (textView != null) {
            textView.setText(this.iX1O1);
        }
        addView(viewInflate2);
    }

    public final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.DialElementView);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f55070IO = typedArrayObtainStyledAttributes.getBoolean(0, this.f55070IO);
        this.f55069I1 = typedArrayObtainStyledAttributes.getBoolean(1, this.f55069I1);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, this.X0i1O);
        this.X0i1O = integer;
        this.XXX11i = typedArrayObtainStyledAttributes.getResourceId(4, integer == 1 ? R.layout.dial_time_digital_content : R.layout.dial_control_content);
        this.X11iII1O1 = typedArrayObtainStyledAttributes.getResourceId(3, R.drawable.dial_control_pop_0);
        this.iX1O1 = typedArrayObtainStyledAttributes.getString(5);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean XO0O10(float f) {
        return (((float) this.iXiX011) * this.iOiXi11II) - (f + ((float) getHeight())) >= 0.0f;
    }

    public final void XOO0ii0() {
        if (XO0O10(getY())) {
            return;
        }
        setY((this.iXiX011 * this.iOiXi11II) - getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        super.dispatchTouchEvent(event);
        if (event.getAction() == 1) {
            NestedScrollView nestedScrollView = this.f55071OO;
            if (nestedScrollView != null) {
                nestedScrollView.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            NestedScrollView nestedScrollView2 = this.f55071OO;
            if (nestedScrollView2 != null) {
                nestedScrollView2.requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38930iO() {
        int i;
        if (getParent() instanceof ViewGroup) {
            ViewParent parent = getParent();
            Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            this.iXiX011 = viewGroup.getMeasuredHeight();
            int measuredWidth = viewGroup.getMeasuredWidth();
            this.iIXi1iiXI = measuredWidth;
            if (this.XOX0O0 && (i = this.iXiX011) != measuredWidth) {
                if (i < measuredWidth) {
                    this.iIXi1iiXI = i;
                } else {
                    this.iXiX011 = measuredWidth;
                }
            }
            int i2 = iArr[0];
            this.XXO = i2;
            int i3 = iArr[1];
            this.O001I = i3;
            int i4 = this.iIXi1iiXI / 2;
            this.iiiO = i4;
            this.iXiiiO = i2 + i4;
            this.Ii1iii0 = i3 + i4;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m38930iO();
        XOO0ii0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@tb1 MotionEvent motionEvent) {
        if (motionEvent != null && this.f55069I1) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action != 0) {
                float f = 0.0f;
                if (action != 1) {
                    if (action == 2) {
                        int i = this.XXO;
                        if (rawX >= i && rawX <= this.iIXi1iiXI + i) {
                            int i2 = this.O001I;
                            if (rawY >= i2 && rawY <= this.iXiX011 + i2) {
                                float f2 = rawX - this.X11I;
                                float f3 = rawY - this.X100O;
                                if (!this.X1IX && this.f55070IO) {
                                    this.X1IX = Math.sqrt((double) ((f2 * f2) + (f3 * f3))) >= 2.0d;
                                }
                                float x = getX() + f2;
                                float y = getY() + f3;
                                float width = this.iIXi1iiXI - getWidth();
                                float height = this.iXiX011 - getHeight();
                                if (x < 0.0f) {
                                    x = 0.0f;
                                } else if (x > width) {
                                    x = width;
                                }
                                if (y >= 0.0f) {
                                    f = y > height ? height : y;
                                }
                                if (!this.XOX0O0) {
                                    setX(x);
                                    setY(f);
                                    this.X11I = rawX;
                                    this.X100O = rawY;
                                } else if (IiI10X(x, f)) {
                                    setX(x);
                                    setY(f);
                                    this.X11I = rawX;
                                    this.X100O = rawY;
                                    ToastUtils.cancel();
                                } else {
                                    ToastUtils.showLong(getContext().getString(R.string.unable_move), new Object[0]);
                                }
                            }
                        }
                    }
                } else if (this.f55070IO && this.X1IX) {
                    if (this.X11I <= this.iIXi1iiXI / 2) {
                        animate().setInterpolator(new BounceInterpolator()).setDuration(500L).x(0.0f).start();
                    } else {
                        animate().setInterpolator(new BounceInterpolator()).setDuration(500L).x(this.iIXi1iiXI - getWidth()).start();
                    }
                }
            } else {
                this.X1IX = false;
                this.X11I = rawX;
                this.X100O = rawY;
            }
        }
        boolean z = this.X1IX;
        return z ? z : super.onTouchEvent(motionEvent);
    }

    public final void setBottomRangeScale(float f) {
        this.iOiXi11II = f;
    }

    public final void setImageRes(int i) {
        ImageView imageView = this.OX110i;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public final void setIsRangeCircle(boolean z) {
        this.XOX0O0 = z;
    }

    public final void setScrollView(@aa1 NestedScrollView view) {
        Intrinsics.X0O(view, "view");
        this.f55071OO = view;
    }

    public final void setTextColor(int i) {
        TextView textView = this.XX1Oi;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialElementView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialElementView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f55070IO = true;
        this.f55069I1 = true;
        this.iX1O1 = "80";
        this.XOX0O0 = true;
        this.iOiXi11II = 1.0f;
        XIi00iiXO(context, attributeSet);
        OXO1(context);
    }

    public /* synthetic */ DialElementView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
