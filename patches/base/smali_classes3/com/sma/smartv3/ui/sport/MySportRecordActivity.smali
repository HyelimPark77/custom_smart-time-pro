.class public final Lcom/sma/smartv3/ui/sport/MySportRecordActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c01;-><init>(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d01;-><init>(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/MySportRecordActivity;)Lcom/google/android/material/tabs/TabLayout;
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

    new-instance v1, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->setMSportMode(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->setMSportMode(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->setMSportMode(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;-><init>()V

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->setMSportMode(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412a3

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060792

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v0

    const v1, 0x7f14160b

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f141516

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f141526

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f141544

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/MySportRecordActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d011f

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
