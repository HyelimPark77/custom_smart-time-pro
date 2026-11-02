.class public final Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/status/SportRecordsV3Activity$OXO1;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/status/SportRecordsV3Activity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "SportRecordsActivity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mRecordsAllV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

.field public mRecordsMonthV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

.field public mRecordsWeekV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

.field public mRecordsYearV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->Companion:Lcom/sma/smartv3/ui/status/SportRecordsV3Activity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/m45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/m45;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/n45;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/n45;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;)Lcom/google/android/material/tabs/TabLayout;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMRecordsAllV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsAllV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRecordsAllV3Fragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRecordsMonthV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsMonthV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRecordsMonthV3Fragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRecordsWeekV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsWeekV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRecordsWeekV3Fragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMRecordsYearV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsYearV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mRecordsYearV3Fragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->table$delegate:Lkotlin/Lazy;

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

    return-void
.end method

.method public initFragments()Ljava/util/List;
    .locals 6
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

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;-><init>()V

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->WEEK:Lcom/sma/smartv3/util/TimePeriod;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setMTimePeriod(Lcom/sma/smartv3/util/TimePeriod;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->setMRecordsWeekV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;-><init>()V

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->MONTH:Lcom/sma/smartv3/util/TimePeriod;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setMTimePeriod(Lcom/sma/smartv3/util/TimePeriod;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->setMRecordsMonthV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;-><init>()V

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->YEAR:Lcom/sma/smartv3/util/TimePeriod;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setMTimePeriod(Lcom/sma/smartv3/util/TimePeriod;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->setMRecordsYearV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;-><init>()V

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->ALL:Lcom/sma/smartv3/util/TimePeriod;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setMTimePeriod(Lcom/sma/smartv3/util/TimePeriod;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->setMRecordsAllV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsWeekV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    const-string v3, "mArg1"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsMonthV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsYearV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsAllV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsWeekV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsMonthV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsYearV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getMRecordsAllV3Fragment()Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Landroidx/fragment/app/Fragment;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->setTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060760

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    const v0, 0x7f1414f1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140f76

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f141621

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f140113

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v1

    check-cast v0, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->setTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout$Tab;->select()V

    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e7c

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

.method public final setMRecordsAllV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsAllV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    return-void
.end method

.method public final setMRecordsMonthV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsMonthV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    return-void
.end method

.method public final setMRecordsWeekV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsWeekV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    return-void
.end method

.method public final setMRecordsYearV3Fragment(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;->mRecordsYearV3Fragment:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;

    return-void
.end method

.method public final setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    const v0, 0x7f140c38

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const v0, 0x7f1412a7

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method
