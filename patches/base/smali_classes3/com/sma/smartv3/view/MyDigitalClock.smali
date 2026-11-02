.class public final Lcom/sma/smartv3/view/MyDigitalClock;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field public I1:Ljava/util/Calendar;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public IO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11iII1O1:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X1IX:Z

.field public XXX11i:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iX1O1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "HH:mm:ss"

    iput-object p1, p0, Lcom/sma/smartv3/view/MyDigitalClock;->IO:Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Lcom/sma/smartv3/view/MyDigitalClock;->XIi00iiXO()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    const-string p1, "HH:mm:ss"

    iput-object p1, p0, Lcom/sma/smartv3/view/MyDigitalClock;->IO:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Lcom/sma/smartv3/view/MyDigitalClock;->XIi00iiXO()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/MyDigitalClock;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/view/MyDigitalClock;->iO(Lcom/sma/smartv3/view/MyDigitalClock;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/view/MyDigitalClock;)V
    .locals 6

    iget-boolean v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->X1IX:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->I1:Ljava/util/Calendar;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget v3, p0, Lcom/sma/smartv3/view/MyDigitalClock;->iX1O1:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->IO:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/view/MyDigitalClock;->I1:Ljava/util/Calendar;

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;Ljava/util/Calendar;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    rem-long v4, v0, v2

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/sma/smartv3/view/MyDigitalClock;->XXX11i:Landroid/os/Handler;

    if-eqz v2, :cond_3

    iget-object p0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->X11iII1O1:Ljava/lang/Runnable;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v0, v1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final XIi00iiXO()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->I1:Ljava/util/Calendar;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->I1:Ljava/util/Calendar;

    :cond_0
    return-void
.end method

.method public final getMCalendar()Ljava/util/Calendar;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->I1:Ljava/util/Calendar;

    return-object v0
.end method

.method public final getMFormat()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->IO:Ljava/lang/String;

    return-object v0
.end method

.method public final getMOffset()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->iX1O1:I

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->X1IX:Z

    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->XXX11i:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rz0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rz0;-><init>(Lcom/sma/smartv3/view/MyDigitalClock;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->X11iII1O1:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/MyDigitalClock;->X1IX:Z

    return-void
.end method

.method public final setMCalendar(Ljava/util/Calendar;)V
    .locals 0
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/MyDigitalClock;->I1:Ljava/util/Calendar;

    return-void
.end method

.method public final setMFormat(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MyDigitalClock;->IO:Ljava/lang/String;

    return-void
.end method

.method public final setMOffset(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MyDigitalClock;->iX1O1:I

    return-void
.end method
