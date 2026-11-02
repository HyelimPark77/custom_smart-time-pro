.class public final Lcom/sma/smartv3/ui/status/WeightActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public weightHistoryFragment:Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

.field public weightMeasureFragment:Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

.field public weightRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gy6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gy6;-><init>(Lcom/sma/smartv3/ui/status/WeightActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hy6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hy6;-><init>(Lcom/sma/smartv3/ui/status/WeightActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iy6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iy6;-><init>(Lcom/sma/smartv3/ui/status/WeightActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/WeightActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/status/WeightActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/WeightActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/WeightActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/WeightActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/WeightActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/WeightActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/WeightActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/status/WeightActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public final getWeightHistoryFragment()Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->weightHistoryFragment:Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "weightHistoryFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getWeightMeasureFragment()Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->weightMeasureFragment:Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "weightMeasureFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getWeightRecordsFragment()Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->weightRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "weightRecordsFragment"

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->initFragment()V

    return-void
.end method

.method public final initFragment()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/WeightActivity;->setWeightRecordsFragment(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/WeightActivity;->setWeightMeasureFragment(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/WeightActivity;->setWeightHistoryFragment(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightRecordsFragment()Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightMeasureFragment()Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightHistoryFragment()Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Landroidx/fragment/app/Fragment;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->i0O()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a06a5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v3, 0x7f060792

    invoke-static {v1, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->setTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081072

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicatorHeight(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    if-eqz v1, :cond_1

    const v3, 0x7f081693

    invoke-virtual {v1, v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    if-eqz v1, :cond_2

    const v3, 0x7f081692

    invoke-virtual {v1, v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    :cond_2
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    if-eqz v0, :cond_3

    const v1, 0x7f081691

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.NoScollViewPager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/NoScollViewPager;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/NoScollViewPager;->setCanScoll(Z)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0123

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

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightRecordsFragment()Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightRecordsFragment()Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;->share()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightMeasureFragment()Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightMeasureFragment()Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;->share()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightHistoryFragment()Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getUserVisibleHint()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/WeightActivity;->getWeightHistoryFragment()Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;->share()V

    :cond_2
    return-void
.end method

.method public final setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const v0, 0x7f141500

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setWeightHistoryFragment(Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->weightHistoryFragment:Lcom/sma/smartv3/ui/status/fragment/WeightHistoryFragment;

    return-void
.end method

.method public final setWeightMeasureFragment(Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->weightMeasureFragment:Lcom/sma/smartv3/ui/status/fragment/WeightMeasureFragment;

    return-void
.end method

.method public final setWeightRecordsFragment(Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/WeightActivity;->weightRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/WeightRecordsFragment;

    return-void
.end method
