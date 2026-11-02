.class public abstract Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jl1;


# instance fields
.field protected mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

.field protected mViewPager:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mFragmentPagerAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mViewPager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    sget v0, Lcom/bestmafen/androidbase/R$id;->view_pager:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->setMViewPager(Landroidx/viewpager/widget/ViewPager;)V

    new-instance v0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    invoke-direct {v0, p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;-><init>(Lcom/android/mltcode/paycertificationapi/jl1;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->setMFragmentPagerAdapter(Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;)V

    return-void
.end method

.method public provideFragmentManager()Landroidx/fragment/app/FragmentManager;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setMFragmentPagerAdapter(Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;)V
    .locals 1
    .param p1    # Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    return-void
.end method

.method public final setMViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1
    .param p1    # Landroidx/viewpager/widget/ViewPager;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    return-void
.end method
