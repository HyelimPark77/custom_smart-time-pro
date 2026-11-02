.class public final Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private aigcFragment:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

.field private customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

.field private dialRecordingFragment:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

.field private isShowAiKeyPop:Z

.field private onlineFragment:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiiXI0OO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiiXI0OO;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1XI0011;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1XI0011;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isShowAiKeyPop$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->isShowAiKeyPop:Z

    return p0
.end method

.method public static final synthetic access$setShowAiKeyPop$p(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->isShowAiKeyPop:Z

    return-void
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->aigcFragment:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->dialRecordingFragment:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    return-void
.end method

.method public initFragments()Ljava/util/List;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMWatchFaceType()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initFragments "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXiOXO()Z

    move-result v1

    const-string v2, "onlineFragment"

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    if-nez v4, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_0
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i1iOO1XIi()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->aigcFragment:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    if-nez v0, :cond_1

    const-string v0, "aigcFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_1
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    if-nez v0, :cond_3

    const-string v0, "customizeFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->dialRecordingFragment:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    if-nez v0, :cond_4

    const-string v0, "dialRecordingFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v3, v0

    :goto_0
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    if-nez v0, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v3, v0

    :goto_1
    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/initializer/BleInitializer;->I1Ii(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060792

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v0

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->i1iOO1XIi()Z

    move-result v4

    const v5, 0x7f140cde

    const/4 v6, 0x3

    const v7, 0x7f140431

    const/4 v8, 0x2

    const v9, 0x7f14043e

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {p0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v2

    const v9, 0x7f1400f9

    invoke-virtual {p0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v1

    invoke-virtual {p0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v8

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v6

    goto :goto_0

    :cond_0
    new-array v4, v6, [Ljava/lang/String;

    invoke-virtual {p0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v2

    invoke-virtual {p0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v1

    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v8

    :goto_0
    check-cast v4, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/OnlineWatchFaceKt;->getWatchFaceCategoryName(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->IXiOXO()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0120

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->I1Ii(Z)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    if-nez v0, :cond_0

    const-string v0, "onlineFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->isSync()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f1412fd

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;

    if-nez p1, :cond_0

    const-string p1, "onlineFragment"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/category/DialCategoryFragment;->isSync()Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f1412fd

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
