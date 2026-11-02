.class public final Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jl1;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCourseDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n19#2:264\n15#2:265\n87#3,7:266\n94#3,3:274\n70#3,7:277\n97#3:284\n1#4:273\n1#4:294\n1#4:310\n104#5,9:285\n113#5,3:295\n99#5,3:298\n104#5,9:301\n113#5,3:311\n99#5,3:314\n1869#6,2:317\n*S KotlinDebug\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n*L\n63#1:264\n63#1:265\n240#1:266,7\n240#1:274,3\n240#1:277,7\n240#1:284\n240#1:273\n258#1:294\n259#1:310\n258#1:285,9\n258#1:295,3\n258#1:298,3\n259#1:301,9\n259#1:311,3\n259#1:314,3\n72#1:317,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCourseDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n19#2:264\n15#2:265\n87#3,7:266\n94#3,3:274\n70#3,7:277\n97#3:284\n1#4:273\n1#4:294\n1#4:310\n104#5,9:285\n113#5,3:295\n99#5,3:298\n104#5,9:301\n113#5,3:311\n99#5,3:314\n1869#6,2:317\n*S KotlinDebug\n*F\n+ 1 CourseDetailsActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseDetailsActivity\n*L\n63#1:264\n63#1:265\n240#1:266,7\n240#1:274,3\n240#1:277,7\n240#1:284\n240#1:273\n258#1:294\n259#1:310\n258#1:285,9\n258#1:295,3\n258#1:298,3\n259#1:301,9\n259#1:311,3\n259#1:314,3\n72#1:317,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private courseCollect:Z

.field private isButtonClick:Z

.field private isDownload:Z

.field private final mButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCardViewLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mCourseDetailsHot$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseDiff$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseHeat$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field protected mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

.field private mIdentity:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRoundPicImage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field protected mViewPager:Landroidx/viewpager/widget/ViewPager;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private widthPixels:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXiI101I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXiI101I;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOOO1ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOOO1ii;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCardViewLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXIi1Oii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXIi1Oii;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mRoundPicImage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX01O0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX01O0I;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OIiXX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1OIiXX1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i000OXXi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i000OXXi1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXO10X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXO10X;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDiff$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXOiiOXiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXOiiOXiO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1O1OII;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1O1OII;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseHeat$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i00IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i00IX;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetailsHot$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I00101OiI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I00101OiI;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mButton$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mIdentity:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroidx/cardview/widget/CardView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCardViewLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroidx/cardview/widget/CardView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mRoundPicImage_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDiff_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Ljava/io/File;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->onButtonClick$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Ljava/io/File;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetailsHot_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Lcom/sma/smartv3/model/CourseDetails;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->init$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Lcom/sma/smartv3/model/CourseDetails;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseHeat_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseName_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final init$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Lcom/sma/smartv3/model/CourseDetails;)Lkotlin/Unit;
    .locals 4

    if-eqz p1, :cond_2

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CourseDetails;->getProgressMarkers()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, -0x1

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/ProgressMarkers;

    if-ne v1, v0, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ProgressMarkers;->getOffset()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/ProgressMarkers;->getOffset()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    sub-int/2addr v3, v1

    move v1, v3

    :goto_1
    invoke-virtual {v2, v1}, Lcom/sma/smartv3/model/ProgressMarkers;->setTime(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->setView()V

    goto :goto_2

    :cond_2
    const p0, 0x7f14018a

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mButton_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a029a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mCardViewLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroidx/cardview/widget/CardView;
    .locals 1

    const v0, 0x7f0a0296

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method private static final mCourseDetailsHot_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a029d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCourseDiff_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a029b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCourseHeat_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a029c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCourseName_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a029e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mCourseTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a02a1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mRoundPicImage_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a029f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final onButtonClick$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Ljava/io/File;I)Lkotlin/Unit;
    .locals 1

    const/16 v0, 0x64

    if-le p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMButton()Landroid/widget/Button;

    move-result-object p2

    const v0, 0x7f1412b8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getAbsolutePath(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->playVideo(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMButton()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f140c4c

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

    goto :goto_0

    :cond_2
    const p1, 0x7f140476

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMButton()Landroid/widget/Button;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method


# virtual methods
.method public final getCourseCollect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->courseCollect:Z

    return v0
.end method

.method public final getMButton()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getMCardViewLayout()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCardViewLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method public final getMCourseDetailsHot()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetailsHot$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMCourseDiff()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDiff$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMCourseHeat()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseHeat$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMCourseName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMCourseTime()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mFragmentPagerAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMIdentity()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mIdentity:Ljava/lang/String;

    return-object v0
.end method

.method public final getMRoundPicImage()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mRoundPicImage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mViewPager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public final getWidthPixels()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->widthPixels:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 32
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mIdentity:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mIdentity:Ljava/lang/String;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/OXOXO11;

    invoke-direct {v4, v0}, Lcom/android/mltcode/paycertificationapi/OXOXO11;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-virtual {v1, v2, v3, v4}, Lcom/sma/smartv3/biz/CourseManager;->OIX0iXi(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_1
    const v1, 0x7f141196

    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_1
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getAppScreenWidth()I

    move-result v1

    iput v1, v0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->widthPixels:I

    return-void
.end method

.method public initFragments()Ljava/util/List;
    .locals 7
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

    sget-object v0, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CourseDetails;->getCourseIntro()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg2"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v4, "mArg3"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v5, Lcom/sma/smartv3/ui/sport/course/DetailIntroduceFragment;

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v5, :cond_2

    check-cast v5, Lcom/sma/smartv3/ui/sport/course/DetailIntroduceFragment;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v6, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v6, v4, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v0, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v0, :cond_1

    check-cast v0, Lcom/sma/smartv3/ui/sport/course/CourseActionFragment;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/bestmafen/androidbase/base/BaseFragment;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.CourseActionFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.DetailIntroduceFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final initImage()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMRoundPicImage()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCoursePic1()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060792

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->setCollectImage()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08126e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final isButtonClick()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

    return v0
.end method

.method public final isDownload()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isDownload:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0051

    return v0
.end method

.method public final onButtonClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CourseDetails;->getVideoFile()Lcom/sma/smartv3/model/VideoFile;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    const p1, 0x7f141008

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "course"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".mp4"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->i0X000X0O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_4

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isDownload:Z

    sget-object p1, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CourseDetails;->getVideoFile()Lcom/sma/smartv3/model/VideoFile;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/VideoFile;->getFilePath()Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I01O1;

    invoke-direct {v3, p0, v2}, Lcom/android/mltcode/paycertificationapi/I01O1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;Ljava/io/File;)V

    invoke-virtual {p1, v0, v1, v3}, Lcom/sma/smartv3/biz/CourseManager;->O00(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getAbsolutePath(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->playVideo(Ljava/lang/String;)V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isDownload:Z

    if-eqz v0, :cond_0

    const v0, 0x7f140fc1

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->initImage()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

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

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "\u529f\u80fd\u5f00\u53d1\u4e2d.."

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final onTitleRightOtherClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final playVideo(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "absolutePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isDownload:Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg2"

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v2, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

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

.method public final setButtonClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isButtonClick:Z

    return-void
.end method

.method public final setCollectImage()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->courseCollect:Z

    if-eqz v1, :cond_0

    const v1, 0x7f081265

    goto :goto_0

    :cond_0
    const v1, 0x7f081264

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final setCourseCollect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->courseCollect:Z

    return-void
.end method

.method public final setDownload(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->isDownload:Z

    return-void
.end method

.method public final setLayoutHeight(II)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCardViewLayout()Landroidx/cardview/widget/CardView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->widthPixels:I

    const/high16 v2, 0x41f00000    # 30.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    sub-int/2addr v1, v2

    mul-int/2addr v1, p2

    div-int/2addr v1, p1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCardViewLayout()Landroidx/cardview/widget/CardView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setMFragmentPagerAdapter(Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;)V
    .locals 1
    .param p1    # Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    return-void
.end method

.method public final setMIdentity(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mIdentity:Ljava/lang/String;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    return-void
.end method

.method public final setView()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->initImage()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCourseName()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseName()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCourseDetailsHot()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseClass()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    const v3, 0x7f1410b5

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCourseDiff()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseDiff()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCourseTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseTime()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v2

    :goto_4
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f140f5d

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMCourseHeat()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseHeat()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object v1, v2

    :goto_5
    const v3, 0x7f140d64

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CourseDetails;->getCollectFlag()Ljava/lang/String;

    move-result-object v2

    :cond_6
    const-string v0, "Y"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->courseCollect:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->setCollectImage()V

    const v0, 0x7f0a18fd    # 1.835632E38f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->setMViewPager(Landroidx/viewpager/widget/ViewPager;)V

    new-instance v0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    invoke-direct {v0, p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;-><init>(Lcom/android/mltcode/paycertificationapi/jl1;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->setMFragmentPagerAdapter(Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f140cc4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f14036c

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method public final setWidthPixels(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseDetailsActivity;->widthPixels:I

    return-void
.end method
