.class public final Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialCustomizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n257#2,2:68\n78#3,3:70\n81#3,5:74\n1#4:73\n*S KotlinDebug\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n*L\n58#1:68,2\n63#1:70,3\n63#1:74,5\n63#1:73\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialCustomizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n257#2,2:68\n78#3,3:70\n81#3,5:74\n1#4:73\n*S KotlinDebug\n*F\n+ 1 DialCustomizeFragment.kt\ncom/sma/smartv3/ui/device/dial/DialCustomizeFragment\n*L\n58#1:68,2\n63#1:70,3\n63#1:74,5\n63#1:73\n*E\n"
    }
.end annotation


# instance fields
.field private final itemCustomize$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final itemVideo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tv_dial_customize_desc$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXOOO10I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXOOO10I;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->itemCustomize$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXO11i0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXO11i0;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->tv_dial_customize_desc$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O11ii100;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11ii100;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->itemVideo$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->itemVideo_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->itemCustomize_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getItemCustomize()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->itemCustomize$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getItemVideo()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->itemVideo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTv_dial_customize_desc()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->tv_dial_customize_desc$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->tv_dial_customize_desc_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->i0X1iIO()Z

    move-result p1

    if-eqz p1, :cond_0

    const p0, 0x7f1412fd

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    const-string v0, "requireActivity(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiiO11(Lcom/android/mltcode/paycertificationapi/q62;Landroid/app/Activity;Landroid/os/Bundle;ILjava/lang/Object;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->i0X1iIO()Z

    move-result p1

    if-eqz p1, :cond_0

    const p0, 0x7f1412fd

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/device/watchface/WatchFaceVideoActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final itemCustomize_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0575

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final itemVideo_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05f9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final tv_dial_customize_desc_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c6e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseCompatLoadingForDrawables"
        }
    .end annotation

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->XOOI0O()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v1, "ko"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getTv_dial_customize_desc()Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f081419

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getTv_dial_customize_desc()Landroid/widget/TextView;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v0, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getItemCustomize()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiXI10X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OiXI10X;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getItemCustomize()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getItemCustomize()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getItemVideo()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-itemVideo>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->X10iI0()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;->getItemVideo()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXi0I1i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iXi0I1i;-><init>(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e6e

    return v0
.end method
