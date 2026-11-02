.class public Lcom/sma/smartv3/ui/device/dial/DialActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field protected aigcFragment:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

.field protected customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

.field protected dialRecordingFragment:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

.field private isShowAiKeyPop:Z

.field private isShowCustom:Z

.field protected onlineFragment:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0O1XXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0O1XXI;-><init>(Lcom/sma/smartv3/ui/device/dial/DialActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOX1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOX1X;-><init>(Lcom/sma/smartv3/ui/device/dial/DialActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dial/DialActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final getAigcFragment()Lcom/sma/smartv3/ui/device/dial/AIGCFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->aigcFragment:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "aigcFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCustomizeFragment()Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "customizeFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDialRecordingFragment()Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->dialRecordingFragment:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dialRecordingFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getOnlineFragment()Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "onlineFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setOnlineFragment(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setCustomizeFragment(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setAigcFragment(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setDialRecordingFragment(Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->IXiOXO()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowCustom:Z

    return-void
.end method

.method public initFragments()Ljava/util/List;
    .locals 3
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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initFragments type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowCustom:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getOnlineFragment()Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i1iOO1XIi()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getAigcFragment()Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getCustomizeFragment()Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getDialRecordingFragment()Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getOnlineFragment()Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 9

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/initializer/BleInitializer;->i1iII1i1(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/initializer/BleInitializer;->I1Ii(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

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

    move-result v3

    const v4, 0x7f140cde

    const/4 v5, 0x3

    const v6, 0x7f140431

    const/4 v7, 0x2

    const v8, 0x7f14043e

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v3, v2

    const v8, 0x7f1400f9

    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v3, v1

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v7

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v5

    goto :goto_0

    :cond_0
    new-array v3, v5, [Ljava/lang/String;

    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v1

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v7

    :goto_0
    check-cast v3, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowCustom:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {p0, v1}, Lcom/sma/smartv3/model/OnlineWatchFaceKt;->getWatchFaceCategoryName(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/dial/DialActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    return-void
.end method

.method public final isShowAiKeyPop()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowAiKeyPop:Z

    return v0
.end method

.method public final isShowCustom()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowCustom:Z

    return v0
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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getOnlineFragment()Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->isSync()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1412fd

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getOnlineFragment()Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->isSync()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1412fd

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final setAigcFragment(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/dial/AIGCFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->aigcFragment:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    return-void
.end method

.method public final setCustomizeFragment(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    return-void
.end method

.method public final setDialRecordingFragment(Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->dialRecordingFragment:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    return-void
.end method

.method public final setOnlineFragment(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    return-void
.end method

.method public final setShowAiKeyPop(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowAiKeyPop:Z

    return-void
.end method

.method public final setShowCustom(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/dial/DialActivity;->isShowCustom:Z

    return-void
.end method
