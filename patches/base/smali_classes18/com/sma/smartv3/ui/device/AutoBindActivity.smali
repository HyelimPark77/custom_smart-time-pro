.class public final Lcom/sma/smartv3/ui/device/AutoBindActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final ivBindTip1$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivBindTip2$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/AutoBindActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTip1$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTip2$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii10;-><init>(Lcom/sma/smartv3/ui/device/AutoBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->tvTip1$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/III11IiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/III11IiX;-><init>(Lcom/sma/smartv3/ui/device/AutoBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->tvTip2$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0X1XXII0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0X1XXII0;-><init>(Lcom/sma/smartv3/ui/device/AutoBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->ivBindTip1$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI0O;-><init>(Lcom/sma/smartv3/ui/device/AutoBindActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->ivBindTip2$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/AutoBindActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/AutoBindActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AutoBindActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->tvTip2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->ivBindTip1_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->ivBindTip2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->tvTip1_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getIvBindTip1(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip1()Lcom/sma/smartv3/view/GifImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getIvBindTip2(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip2()Lcom/sma/smartv3/view/GifImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvTip1(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getTvTip1()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvTip2(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getTvTip2()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final getIvBindTip1()Lcom/sma/smartv3/view/GifImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->ivBindTip1$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/GifImageView;

    return-object v0
.end method

.method private final getIvBindTip2()Lcom/sma/smartv3/view/GifImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->ivBindTip2$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/GifImageView;

    return-object v0
.end method

.method private final getTvTip1()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->tvTip1$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvTip2()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->tvTip2$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final ivBindTip1_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;
    .locals 1

    const v0, 0x7f0a0618

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/GifImageView;

    return-object p0
.end method

.method private static final ivBindTip2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Lcom/sma/smartv3/view/GifImageView;
    .locals 1

    const v0, 0x7f0a0619

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/GifImageView;

    return-object p0
.end method

.method private static final tvTip1_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a1890    # 1.83561E38f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvTip2_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AutoBindActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a1891

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AutoBindActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setNavBarVisibility(Z)V

    const v1, 0x7f0a0bcc

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/ek4;->O10IXXX0X()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getCurSkinName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "light"

    invoke-static {v1, v4, v0, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip1()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v1

    const v2, 0x7f08156b

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/view/GifImageView;->setGifResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip2()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v1

    const v2, 0x7f08156c

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/view/GifImageView;->setGifResource(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip1()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v1

    const v2, 0x7f13000b

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/view/GifImageView;->setGifResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip2()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v1

    const v2, 0x7f13000c

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/view/GifImageView;->setGifResource(I)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip1()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip2()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AutoBindActivity;->getIvBindTip2()Lcom/sma/smartv3/view/GifImageView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/GifImageView;->pause()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0035

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AutoBindActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AutoBindActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 0

    return-void
.end method
