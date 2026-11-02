.class public final Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->showPrayerTime(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/model/PrayerTime;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n1#2:121\n18#3,2:122\n15#3:124\n11#3,2:125\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n*L\n79#1:122,2\n79#1:124\n89#1:125,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n1#2:121\n18#3,2:122\n15#3:124\n11#3,2:125\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n*L\n79#1:122,2\n79#1:124\n89#1:125,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;->this$0:Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;

    const v0, 0x7f0d0f07

    invoke-direct {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/model/PrayerTime;Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;->convert$lambda$1$1$0(Lcom/sma/smartv3/model/PrayerTime;Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;ILcom/sma/smartv3/model/PrayerTime;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;->convert$lambda$1(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;ILcom/sma/smartv3/model/PrayerTime;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$1(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;ILcom/sma/smartv3/model/PrayerTime;Landroid/view/View;)V
    .locals 3

    new-instance p3, Ljava/util/ArrayList;

    const/16 v0, 0x79

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v2, v1, -0x3c

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/qv1;

    invoke-direct {v0, p0, p3}, Lcom/android/mltcode/paycertificationapi/qv1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    const p3, 0x7f141110

    invoke-virtual {v0, p3}, Lcom/android/mltcode/paycertificationapi/qv1;->IXXOO(I)V

    const p3, 0x7f140f5d

    invoke-virtual {v0, p3}, Lcom/android/mltcode/paycertificationapi/qv1;->iOO1ii1(I)V

    new-instance p3, Lcom/android/mltcode/paycertificationapi/ea2;

    invoke-direct {p3, p2, p0}, Lcom/android/mltcode/paycertificationapi/ea2;-><init>(Lcom/sma/smartv3/model/PrayerTime;Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;)V

    invoke-virtual {v0, p3}, Lcom/android/mltcode/paycertificationapi/qv1;->iX(Lkotlin/jvm/functions/Function1;)V

    add-int/lit8 p1, p1, 0x3c

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/qv1;->O1O(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method private static final convert$lambda$1$1$0(Lcom/sma/smartv3/model/PrayerTime;Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;I)Z
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/PrayerTimeSettings;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/model/PrayerTimeSettings;

    add-int/lit8 p2, p2, -0x3c

    invoke-virtual {p0}, Lcom/sma/smartv3/model/PrayerTime;->getType()Lcom/sma/smartv3/model/PrayTimeType;

    move-result-object p0

    sget-object v2, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1$OXO1;->OXO1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/PrayerTimeSettings;->setIshaAdjustment(I)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/PrayerTimeSettings;->setMaghribAdjustment(I)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/PrayerTimeSettings;->setAsrAdjustment(I)V

    goto :goto_0

    :pswitch_3
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/PrayerTimeSettings;->setDhuhrAdjustment(I)V

    goto :goto_0

    :pswitch_4
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/PrayerTimeSettings;->setSunriseAdjustment(I)V

    goto :goto_0

    :pswitch_5
    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/PrayerTimeSettings;->setFajrAdjustment(I)V

    :goto_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;->onInfoChange(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/PrayerTime;I)V
    .locals 3

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0cc7

    .line 2
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    const-string v1, "mContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/model/PrayerTime;->getTimeName(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(I)V

    const p3, 0x7f0a188d

    .line 3
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/PrayerTime;->getTimeString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p2}, Lcom/sma/smartv3/model/PrayerTime;->getAdjustmentMin()I

    move-result p3

    const v0, 0x7f0a0cbe

    .line 5
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz p3, :cond_0

    const v2, 0x7f140f5d

    .line 6
    invoke-static {p3, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IiI10X(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 7
    :cond_0
    const-string v2, ""

    .line 8
    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a06de

    .line 9
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const-string v2, "getView(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x43480000    # 200.0f

    invoke-static {v0, v2}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const v0, 0x7f0a027d

    .line 10
    invoke-virtual {p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0, v2}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/model/PrayerTime;->getTimeIcon(Landroid/content/Context;)I

    move-result v0

    const v1, 0x7f0a0638

    invoke-virtual {p1, v1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 14
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getConvertView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;->this$0:Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/da2;

    invoke-direct {v1, v0, p3, p2}, Lcom/android/mltcode/paycertificationapi/da2;-><init>(Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity;ILcom/sma/smartv3/model/PrayerTime;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/model/PrayerTime;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/PrayerTime;I)V

    return-void
.end method
