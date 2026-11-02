.class public final Lcom/sma/smartv3/ui/sport/AppStartSportActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppStartSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n13805#2,2:119\n37#3,2:121\n*S KotlinDebug\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n*L\n67#1:119,2\n97#1:121,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppStartSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n13805#2,2:119\n37#3,2:121\n*S KotlinDebug\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n*L\n67#1:119,2\n97#1:121,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private curMode:I

.field public mTableList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O10i0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O10i0i;-><init>(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIIiiIIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIIiiIIO;-><init>(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->table$delegate:Lkotlin/Lazy;

    const/16 v0, 0xa

    iput v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getFragment(I)Landroidx/fragment/app/Fragment;
    .locals 1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment;->Companion:Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;->OXO1(I)Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->Companion:Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;->OXO1(I)Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;

    move-result-object p1

    return-object p1
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/AppStartSportActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final getCurMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    return v0
.end method

.method public final getMTableList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->mTableList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mTableList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public final getTiTle()[Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v4}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v3, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v2

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v2}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    iget v3, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/a15;->XIi00iiXO()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->setMTableList(Ljava/util/List;)V

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

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getFragment(I)Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getFragment(I)Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public initView()V
    .locals 9

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140240

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const v1, 0x7f060792

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->Xi()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setTabMode(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTiTle()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v1

    move-object v2, v0

    check-cast v2, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->removeAllTabs()V

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v5

    const-string v6, "newTab(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    const v7, 0x7f0d1088

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f0a1897

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v6}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(Landroid/view/View;)Lcom/google/android/material/tabs/TabLayout$Tab;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->setTabMode(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->getMTableList()Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0032

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

.method public final setCurMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->curMode:I

    return-void
.end method

.method public final setMTableList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/AppStartSportActivity;->mTableList:Ljava/util/List;

    return-void
.end method
