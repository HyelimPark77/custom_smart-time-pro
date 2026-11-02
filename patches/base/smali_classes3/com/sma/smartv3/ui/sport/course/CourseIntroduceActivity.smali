.class public final Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jl1;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCourseIntroduceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1869#2:92\n1870#2:109\n104#3,9:93\n113#3,3:103\n99#3,3:106\n1#4:102\n*S KotlinDebug\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n*L\n85#1:92\n85#1:109\n86#1:93,9\n86#1:103,3\n86#1:106,3\n86#1:102\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCourseIntroduceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1869#2:92\n1870#2:109\n104#3,9:93\n113#3,3:103\n99#3,3:106\n1#4:102\n*S KotlinDebug\n*F\n+ 1 CourseIntroduceActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseIntroduceActivity\n*L\n85#1:92\n85#1:109\n86#1:93,9\n86#1:103,3\n86#1:106,3\n86#1:102\n*E\n"
    }
.end annotation


# instance fields
.field private curPosition:I

.field private mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

.field protected mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

.field private final mIntroduceCur$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mViewPager$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X001;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X001;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mViewPager$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii0XX;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mIntroduceCur$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mIntroduceCur_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mViewPager_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p0

    return-object p0
.end method

.method private final getMViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mViewPager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    return-object v0
.end method

.method private static final mIntroduceCur_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0555

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mViewPager_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 1

    const v0, 0x7f0a02a2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method


# virtual methods
.method public final getCurPosition()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    return v0
.end method

.method public final getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mFragmentPagerAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMIntroduceCur()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mIntroduceCur$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.CourseDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/CourseDetails;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

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

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "mCourseDetails"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getProgressMarkers()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/ProgressMarkers;

    sget-object v4, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "mArg0"

    invoke-virtual {v4, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "mArg2"

    invoke-virtual {v4, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v5, "mArg3"

    invoke-virtual {v4, v5, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class v3, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v3, :cond_1

    check-cast v3, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceFragment;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.course.CourseIntroduceFragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-object v0
.end method

.method public initView()V
    .locals 3

    new-instance v0, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    invoke-direct {v0, p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;-><init>(Lcom/android/mltcode/paycertificationapi/jl1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->setMFragmentPagerAdapter(Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity$initView$2;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0052

    return v0
.end method

.method public final onBeforeIntroduce(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    if-eqz p1, :cond_0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-nez p1, :cond_1

    const-string p1, "mCourseDetails"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/model/CourseDetails;->getProgressMarkers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public final onNextIntroduce(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-nez v0, :cond_0

    const-string v0, "mCourseDetails"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/CourseDetails;->getProgressMarkers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

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

.method public final setCurPosition(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->curPosition:I

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseIntroduceActivity;->mFragmentPagerAdapter:Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    return-void
.end method
