.class public Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;
.super Landroidx/fragment/app/FragmentStatePagerAdapter;
.source "SourceFile"


# instance fields
.field private mFragments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private mTitles:[Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/jl1;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jl1;->provideFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentStatePagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 2
    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jl1;->initFragments()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mFragments:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/jl1;I)V
    .locals 1

    .line 6
    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jl1;->provideFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentStatePagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 7
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 8
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mTitles:[Ljava/lang/CharSequence;

    goto :goto_0

    .line 9
    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1

    .line 10
    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mTitles:[Ljava/lang/CharSequence;

    .line 11
    :goto_0
    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jl1;->initFragments()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mFragments:Ljava/util/List;

    return-void

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "provider must be an instance of Activity or Fragment"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/jl1;[Ljava/lang/CharSequence;)V
    .locals 1

    .line 3
    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jl1;->provideFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/fragment/app/FragmentStatePagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 4
    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/jl1;->initFragments()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mFragments:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mTitles:[Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mFragments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroidx/fragment/app/Fragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mFragments:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/viewpager/BaseStatePagerAdapter;->mTitles:[Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-le v1, p1, :cond_0

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
