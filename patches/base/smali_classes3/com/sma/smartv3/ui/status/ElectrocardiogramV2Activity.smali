.class public final Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nElectrocardiogramV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n69#2,3:107\n72#2,5:111\n1#3:110\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n*L\n87#1:107,3\n87#1:111,5\n87#1:110\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nElectrocardiogramV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n69#2,3:107\n72#2,5:111\n1#3:110\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n*L\n87#1:107,3\n87#1:111,5\n87#1:110\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mEcgV2DayFragment:Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

.field private mPopupWindow:Landroid/widget/PopupWindow;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi1IXI01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi1IXI01;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIIIO11iO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iIIIO11iO;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXiIO01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXiIO01;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->onTitleRightClick$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->onTitleRightClick$lambda$2(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->onTitleRightClick$lambda$1(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private static final onTitleRightClick$lambda$0(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/EleRecordListActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final onTitleRightClick$lambda$1(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V
    .locals 1

    const p1, 0x7f14107b

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private static final onTitleRightClick$lambda$2(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;Landroid/view/View;)V
    .locals 1

    const p1, 0x7f1403f0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getMEcgV2DayFragment()Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mEcgV2DayFragment:Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mEcgV2DayFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->setMEcgV2DayFragment(Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1404cc

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0a068a

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getMEcgV2DayFragment()Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f08124d

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080915

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06001e

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0098

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f0d104c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const-string v1, "inflate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-nez v1, :cond_0

    new-instance v1, Landroid/widget/PopupWindow;

    const/4 v2, -0x2

    invoke-direct {v1, v0, v2, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    :cond_2
    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v3, 0x0

    aget v4, v1, v3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    sub-int v5, v4, v5

    add-int/2addr v4, v5

    const/high16 v5, 0x41a00000    # 20.0f

    invoke-static {p0, v5}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result v5

    add-int/2addr v4, v5

    aget v1, v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mPopupWindow:Landroid/widget/PopupWindow;

    if-eqz v2, :cond_3

    invoke-virtual {v2, p1, v3, v4, v1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_3
    const p1, 0x7f0a0356

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXX1iII1i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IXX1iII1i;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0354

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O01O0OX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O01O0OX;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a034f

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi01O1;-><init>(Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onTitleRightOtherClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getMEcgV2DayFragment()Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->getMEcgV2DayFragment()Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->showCalendarPopop()V

    :cond_0
    return-void
.end method

.method public final setMEcgV2DayFragment(Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/ElectrocardiogramV2Activity;->mEcgV2DayFragment:Lcom/sma/smartv3/ui/status/fragment/EcgV2DayFragment;

    return-void
.end method
