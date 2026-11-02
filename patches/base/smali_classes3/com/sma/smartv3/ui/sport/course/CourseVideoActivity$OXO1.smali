.class public final Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity$OXO1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity$OXO1;->IO:Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity$OXO1;->XIi00iiXO(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V
    .locals 8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseCurTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->access$getMPlayer$p(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "mPlayer"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-interface {v1}, Landroidx/media3/common/Player;->getCurrentPosition()J

    move-result-wide v4

    const/16 v1, 0x3e8

    int-to-long v6, v1

    div-long/2addr v4, v6

    long-to-int v1, v4

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XOO0XOOii(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseMaxTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->access$getMPlayer$p(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-interface {v1}, Landroidx/media3/common/Player;->getDuration()J

    move-result-wide v4

    div-long/2addr v4, v6

    long-to-int v1, v4

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XOO0XOOii(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseSeekBar()Lcom/sma/smartv3/view/VideoSeekBar;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->access$getMPlayer$p(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-interface {v1}, Landroidx/media3/common/Player;->getCurrentPosition()J

    move-result-wide v4

    div-long/2addr v4, v6

    long-to-int v1, v4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->getMCourseSeekBar()Lcom/sma/smartv3/view/VideoSeekBar;

    move-result-object v0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;->access$getMPlayer$p(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p0

    if-nez p0, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, p0

    :goto_0
    invoke-interface {v2}, Landroidx/media3/common/Player;->getDuration()J

    move-result-wide v1

    div-long/2addr v1, v6

    long-to-int p0, v1

    invoke-virtual {v0, p0}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity$OXO1;->IO:Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0OI1I0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I0OI1I0;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseVideoActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
