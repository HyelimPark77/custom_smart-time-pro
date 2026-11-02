.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWatchFaceDialPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n93#2,2:180\n90#2:182\n87#3,7:183\n94#3,3:191\n70#3,7:194\n97#3:201\n1#4:190\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n*L\n121#1:180,2\n121#1:182\n133#1:183,7\n133#1:191,3\n133#1:194,7\n133#1:201\n133#1:190\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWatchFaceDialPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n93#2,2:180\n90#2:182\n87#3,7:183\n94#3,3:191\n70#3,7:194\n97#3:201\n1#4:190\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n*L\n121#1:180,2\n121#1:182\n133#1:183,7\n133#1:191,3\n133#1:194,7\n133#1:201\n133#1:190\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private aigcFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;

.field private customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

.field private dialRecordingFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

.field private isShowAiKeyPop:Z

.field private final isShowCustom:Z

.field private onlineFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vn6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vn6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wn6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wn6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXiOXO()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->isShowCustom:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->showAILackingTip$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Z

    move-result p0

    return p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->showAILackingTip()V

    return-void
.end method

.method private static final showAILackingTip$lambda$0$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Z
    .locals 5

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->iOO1ii1()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v1, v3, v2}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v4, "mArg0"

    invoke-virtual {v1, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v4, 0x2

    invoke-virtual {v1, v0, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return v3
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    new-instance p1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->aigcFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;

    new-instance p1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->dialRecordingFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initFragments()Ljava/util/List;
    .locals 4
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

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->isShowCustom:Z

    const-string v1, "onlineFragment"

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

    if-nez v3, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i1iOO1XIi()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->aigcFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayAIGCFragment;

    if-nez v1, :cond_1

    const-string v1, "aigcFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->customizeFragment:Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    if-nez v1, :cond_3

    const-string v1, "customizeFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->dialRecordingFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment;

    if-nez v1, :cond_4

    const-string v1, "dialRecordingFragment"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v2, v1

    :goto_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->onlineFragment:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v2, v0

    :goto_1
    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-static {p0, v1}, Lcom/sma/smartv3/model/OnlineWatchFaceKt;->getWatchFaceCategoryName(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;->isShowCustom:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/un6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/un6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V

    const-wide/16 v2, 0x708

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0120

    return v0
.end method

.method public final onChangedIndex(I)V
    .locals 1
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "FACE_DIAL_INDEX"
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-le v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_0
    return-void
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

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->i0X1iIO()Z

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

    sget-object p1, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {p1}, Lcom/sma/smartv3/initializer/BleInitializer;->i0X1iIO()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1412fd

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final showAILackingTip()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IIII0iI()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOX1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOI0i0I()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OXi001()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "USER_MEMBER_DATA_TIME"

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "USER_MEMBER"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x5f

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v9, Lcom/sma/smartv3/model/UserMember;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1, v9}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v9}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/model/UserMember;

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "WatchFaceDialPayActivity showAILackingTip  mIsShowTime = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, " mUserMember = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v7

    cmp-long v3, v7, v3

    if-lez v3, :cond_1

    sget-object v7, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/UserMember;->getLatestDateTime()J

    move-result-wide v8

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/biz/OrderManager;->O00(Lcom/sma/smartv3/biz/OrderManager;JIILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v7, v5, v6, v1}, Lcom/sma/smartv3/biz/OrderManager;->IiI10X(JI)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, p0, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f141348

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v2, 0x7f1400bf

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xn6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xn6;-><init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method
