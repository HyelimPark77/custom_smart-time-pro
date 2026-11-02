.class public final Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Player$Listener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCourseVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n36#2:322\n1563#3:323\n1634#3,3:324\n1878#3,3:327\n*S KotlinDebug\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n*L\n103#1:322\n215#1:323\n215#1:324,3\n230#1:327,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCourseVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n36#2:322\n1563#3:323\n1634#3,3:324\n1878#3,3:327\n*S KotlinDebug\n*F\n+ 1 CourseVideoActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseVideoActivity\n*L\n103#1:322\n215#1:323\n215#1:324,3\n230#1:327,3\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isPlay:Z

.field private isShowView:Z

.field private final mActionIndex:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mControllerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseCurTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mCourseLockScreen$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseMaxTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseNext$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCoursePlay$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCoursePrevious$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCourseSeekBar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

.field private final mPlayerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTimer:Ljava/util/Timer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mTvHintTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTvOnBack$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTvOnPlay$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final task:Ljava/util/TimerTask;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "CourseVideoActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1Xi0IOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1Xi0IOO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OX00O01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1OX00O01;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mControllerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI0IXOI1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI0IXOI1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseMaxTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0II0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0II0;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseCurTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iiiXXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0iiiXXi;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseSeekBar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X01Xi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X01Xi;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvOnBack$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX1IIO1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX1IIO1i;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvOnPlay$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIIXii0XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XIIXii0XO;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvHintTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iI00i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iI00i;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseNext$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX1Oi0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX1Oi0i;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCoursePlay$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiIX1IOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiIX1IOI;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCoursePrevious$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1XXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O1XXi;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseLockScreen$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->task:Ljava/util/TimerTask;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mActionIndex:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isShowView:Z

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCoursePlay_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvOnBack_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseNext_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseCurTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCoursePrevious_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/ui/PlayerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/ui/PlayerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvOnPlay_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvHintTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseLockScreen_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseMaxTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/VideoSeekBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseSeekBar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/VideoSeekBar;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMPlayer$p(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    return-object p0
.end method

.method private final completeCourse()V
    .locals 0

    return-void
.end method

.method private final getMControllerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mControllerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMPlayerView()Landroidx/media3/ui/PlayerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/ui/PlayerView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mControllerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mControllerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0297

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mCourseCurTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a02b3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCourseLockScreen_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a02a3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCourseMaxTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a02b4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCourseNext_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a02a6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCoursePlay_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a02a9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCoursePrevious_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a02aa

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCourseSeekBar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Lcom/sma/smartv3/view/VideoSeekBar;
    .locals 1

    const v0, 0x7f0a02af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/VideoSeekBar;

    return-object p0
.end method

.method private static final mPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/ui/PlayerView;
    .locals 1

    const v0, 0x7f0a0934

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/media3/ui/PlayerView;

    return-object p0
.end method

.method private static final mTvHintTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c95

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTvOnBack_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cd9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTvOnPlay_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cda

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final curPlayAction(Z)V
    .locals 12

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->initActionIndex()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v1, 0x0

    const-string v2, "mPlayer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0}, Landroidx/media3/common/Player;->getCurrentPosition()J

    move-result-wide v3

    const/16 v0, 0x3e8

    int-to-long v5, v0

    div-long/2addr v3, v5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mActionIndex:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, -0x1

    const/4 v6, 0x0

    move v7, v5

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v6, 0x1

    if-gez v6, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v10, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "  mActionIndex \u6267\u884c--?> "

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " "

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    int-to-long v10, v8

    cmp-long v8, v10, v3

    if-lez v8, :cond_3

    if-ne v7, v5, :cond_3

    :goto_1
    move v7, v6

    goto :goto_2

    :cond_2
    int-to-long v10, v8

    cmp-long v8, v10, v3

    if-gtz v8, :cond_3

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_3
    :goto_2
    move v6, v9

    goto :goto_0

    :cond_4
    if-ne v7, v5, :cond_7

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->completeCourse()V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object v1, p1

    :goto_3
    const-wide/16 v2, 0x0

    invoke-interface {v1, v2, v3}, Landroidx/media3/common/Player;->seekTo(J)V

    return-void

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    move-object v1, p1

    :goto_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mActionIndex:Ljava/util/List;

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-interface {v1, v2, v3}, Landroidx/media3/common/Player;->seekTo(J)V

    return-void
.end method

.method public final getMCourseCurTime()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseCurTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMCourseLockScreen()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseLockScreen$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMCourseMaxTime()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseMaxTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getMCourseNext()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseNext$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMCoursePlay()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCoursePlay$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMCoursePrevious()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCoursePrevious$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMCourseSeekBar()Lcom/sma/smartv3/view/VideoSeekBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseSeekBar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/VideoSeekBar;

    return-object v0
.end method

.method public getMStatusStyle()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getMTimer()Ljava/util/Timer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTimer:Ljava/util/Timer;

    return-object v0
.end method

.method public final getMTvHintTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvHintTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMTvOnBack()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvOnBack$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getMTvOnPlay()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTvOnPlay$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getTask()Ljava/util/TimerTask;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->task:Ljava/util/TimerTask;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/CourseDetails;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    return-void
.end method

.method public final initActionIndex()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mActionIndex:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CourseDetails;->getProgressMarkers()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/ProgressMarkers;

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ProgressMarkers;->getOffset()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u5f53\u524d\u4e0b\u6807  ---> ???  = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mActionIndex:Ljava/util/List;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ProgressMarkers;->getOffset()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method

.method public initView()V
    .locals 8

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->getCourseName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/view/View;->setKeepScreenOn(Z)V

    new-instance v1, Landroidx/media3/exoplayer/ExoPlayer$Builder;

    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->build()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    const-string v3, "build(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const-string v4, "mPlayer"

    if-nez v3, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    invoke-virtual {v1, v3}, Landroidx/media3/ui/PlayerView;->setPlayer(Landroidx/media3/common/Player;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v1, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-interface {v1, p0}, Landroidx/media3/common/Player;->addListener(Landroidx/media3/common/Player$Listener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v1, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Landroidx/media3/common/MediaItem;->fromUri(Landroid/net/Uri;)Landroidx/media3/common/MediaItem;

    move-result-object v3

    invoke-interface {v1, v3}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v1, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_4
    invoke-interface {v1}, Landroidx/media3/common/Player;->prepare()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v1, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_5
    invoke-interface {v1}, Landroidx/media3/common/Player;->play()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->initActionIndex()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseSeekBar()Lcom/sma/smartv3/view/VideoSeekBar;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mActionIndex:Ljava/util/List;

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/view/VideoSeekBar;->setRulerCount(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseSeekBar()Lcom/sma/smartv3/view/VideoSeekBar;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseCurTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v3, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_6
    invoke-interface {v3}, Landroidx/media3/common/Player;->getCurrentPosition()J

    move-result-wide v3

    const/16 v5, 0x3e8

    int-to-long v5, v5

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseMaxTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mCourseDetails:Lcom/sma/smartv3/model/CourseDetails;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CourseDetails;->getCourseTime()Ljava/lang/String;

    move-result-object v2

    :cond_7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseNext()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCoursePlay()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCoursePrevious()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseLockScreen()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const-string v2, "#21201F"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v3, v4, v2}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->O011OOIO0(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMControllerView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTimer:Ljava/util/Timer;

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->task:Ljava/util/TimerTask;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x3e8

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final isShowView()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isShowView:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0054

    return v0
.end method

.method public final onBack(Landroid/view/View;)V
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

.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isPlay:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " \u70b9\u51fb\u4e86\u76d1\u542c isPlay "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const/4 v1, 0x1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const v3, 0x7f0a02a6

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->curPlayAction(Z)V

    return-void

    :cond_2
    :goto_1
    const/16 v2, 0x8

    const/4 v3, 0x0

    if-nez p1, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const v5, 0x7f0a02a9

    if-ne v4, v5, :cond_7

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isPlay:Z

    const-string v4, "mPlayer"

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v0, p1

    :goto_2
    invoke-interface {v0}, Landroidx/media3/common/Player;->pause()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCoursePlay()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f08126c

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvOnBack()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvOnPlay()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvHintTitle()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object v0, p1

    :goto_3
    invoke-interface {v0}, Landroidx/media3/common/Player;->play()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCoursePlay()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f08126b

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvOnBack()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvOnPlay()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvHintTitle()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isPlay:Z

    xor-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isPlay:Z

    return-void

    :cond_7
    :goto_5
    if-nez p1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v4, 0x7f0a02aa

    if-ne v0, v4, :cond_9

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->curPlayAction(Z)V

    return-void

    :cond_9
    :goto_6
    if-nez p1, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v4, 0x7f0a02a3

    if-eq v0, v4, :cond_d

    :goto_7
    if-nez p1, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7f0a0934

    if-ne p1, v0, :cond_d

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isShowView:Z

    xor-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isShowView:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMControllerView()Landroid/view/View;

    move-result-object p1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isShowView:Z

    if-eqz v0, :cond_c

    move v2, v3

    :cond_c
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_d
    :goto_8
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    invoke-super {p0, p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v1, 0x0

    const-string v2, "mPlayer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0, p0}, Landroidx/media3/common/Player;->removeListener(Landroidx/media3/common/Player$Listener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-interface {v1}, Landroidx/media3/exoplayer/ExoPlayer;->release()V

    return-void
.end method

.method public onIsPlayingChanged(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onIsPlayingChanged(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onIsPlayingChanged  isPlaying = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onPause()V

    return-void
.end method

.method public final onPlay(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_0

    const-string p1, "mPlayer"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p1}, Landroidx/media3/common/Player;->play()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCoursePlay()Landroid/widget/ImageView;

    move-result-object p1

    const v0, 0x7f08126b

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isPlay:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isPlay:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvOnBack()Landroid/widget/TextView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvOnPlay()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMTvHintTitle()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onPlayWhenReadyChanged(ZI)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/media3/common/Player$Listener;->onPlayWhenReadyChanged(ZI)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " onPlayWhenReadyChanged"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onPlaybackStateChanged(I)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onPlaybackStateChanged(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onPlaybackStateChanged playbackState = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->completeCourse()V

    return-void
.end method

.method public onPlayerError(Landroidx/media3/common/PlaybackException;)V
    .locals 1
    .param p1    # Landroidx/media3/common/PlaybackException;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onPlayerError(Landroidx/media3/common/PlaybackException;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onResume()V

    return-void
.end method

.method public onSeekBackIncrementChanged(J)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroidx/media3/common/Player$Listener;->onSeekBackIncrementChanged(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onSeekBackIncrementChanged "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onSeekForwardIncrementChanged(J)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroidx/media3/common/Player$Listener;->onSeekForwardIncrementChanged(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onSeekForwardIncrementChanged "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

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

.method public final setMTimer(Ljava/util/Timer;)V
    .locals 0
    .param p1    # Ljava/util/Timer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->mTimer:Ljava/util/Timer;

    return-void
.end method

.method public final setShowView(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->isShowView:Z

    return-void
.end method
