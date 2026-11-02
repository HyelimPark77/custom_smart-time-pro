.class public final Lcom/sma/smartv3/ui/order/OrderDetailActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,86:1\n37#2,2:87\n*S KotlinDebug\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n*L\n74#1:87,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,86:1\n37#2,2:87\n*S KotlinDebug\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n*L\n74#1:87,2\n*E\n"
    }
.end annotation


# instance fields
.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zi1;-><init>(Lcom/sma/smartv3/ui/order/OrderDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/order/OrderDetailActivity;->table$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/order/OrderDetailActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/order/OrderDetailActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/order/OrderDetailActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method private final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/order/OrderDetailActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/order/OrderDetailActivity;)Lcom/google/android/material/tabs/TabLayout;
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

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/sma/smartv3/ui/order/fragment/DialOrderListFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/order/fragment/DialOrderListFragment;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->iIi0()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IOX1()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/sma/smartv3/ui/order/fragment/MemberOrderListFragment;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/order/fragment/MemberOrderListFragment;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/sma/smartv3/ui/order/fragment/IntegralOrderListFragment;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/order/fragment/IntegralOrderListFragment;-><init>()V

    :goto_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->iIIIi()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/order/fragment/GameOrderListFragment;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141484

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/OrderDetailActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060792

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO()Z

    move-result v1

    const-string v2, "getString(...)"

    if-nez v1, :cond_0

    const v1, 0x7f14043f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->iIi0()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IOX1()Z

    move-result v3

    if-eqz v3, :cond_1

    const v3, 0x7f1400db

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const v3, 0x7f140d29

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->iIIIi()Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, 0x7f140c35

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/OrderDetailActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/order/OrderDetailActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00d9

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
