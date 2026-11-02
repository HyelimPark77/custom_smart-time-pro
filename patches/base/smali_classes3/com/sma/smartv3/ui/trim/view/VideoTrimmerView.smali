.class public Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/j0;


# static fields
.field public static final iiIOiX:Ljava/lang/String; = "VideoTrimmerView"


# instance fields
.field public I1:Landroid/content/Context;

.field public final IO:I

.field public IO0II0i:Lcom/github/gzuliyujiang/imagepicker/CropImageOptions;

.field public IXI:I

.field public IXOIIIO:Landroid/net/Uri;

.field public Ii0X0X:I

.field public Ii0i:I

.field public Ii1iii0:Landroid/net/Uri;

.field public IiiXiI0I:I

.field public O001I:Landroid/widget/TextView;

.field public OO:J

.field public OX110i:J

.field public X00XIX1:I

.field public X00Xi1X:Landroid/os/Handler;

.field public X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

.field public X1:Lcom/github/gzuliyujiang/imagepicker/CropImageView;

.field public X100O:Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;

.field public X11I:I

.field public X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

.field public X1IX:Landroidx/recyclerview/widget/RecyclerView;

.field public XO0X10iO:Z

.field public final XOIX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

.field public final XOO0XOOii:Ljava/lang/Runnable;

.field public XOX0O0:J

.field public final XOXiX0:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

.field public XX1Oi:Z

.field public XXO:F

.field public XXX11i:Landroid/widget/ImageView;

.field public XXiIiX10:Landroid/animation/ValueAnimator;

.field public i0X000X0O:I

.field public i11I:Z

.field public iIXi1iiXI:Landroid/widget/LinearLayout;

.field public iOiXi11II:J

.field public iX1O1:Landroid/widget/RelativeLayout;

.field public iXiX011:Landroid/widget/ImageView;

.field public iXiiiO:F

.field public iiiO:Lcom/android/mltcode/paycertificationapi/zf6;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs",
            "defStyleAttr"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget p2, Lcom/android/mltcode/paycertificationapi/ag6;->I0IIOi:I

    iput p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IO:I

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11I:I

    .line 5
    iput-boolean p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XX1Oi:Z

    const-wide/16 p2, 0x0

    .line 6
    iput-wide p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    .line 7
    iput-wide p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOiXi11II:J

    .line 8
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X00Xi1X:Landroid/os/Handler;

    const/16 p2, 0xe

    .line 9
    iput p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IiiXiI0I:I

    .line 10
    new-instance p2, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;

    invoke-direct {p2, p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOIX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

    .line 11
    new-instance p2, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;

    invoke-direct {p2, p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOXiX0:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    .line 12
    new-instance p2, Lcom/android/mltcode/paycertificationapi/lg6;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/lg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOO0XOOii:Ljava/lang/Runnable;

    .line 13
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iX(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iI()V

    return-void
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    return-object p0
.end method

.method public static bridge synthetic I1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)I
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->i010I()I

    move-result p0

    return p0
.end method

.method public static bridge synthetic I1XOi1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/ZVideoView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    return-object p0
.end method

.method public static bridge synthetic II1Xi0()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiIOiX:Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOiXi11II:J

    return-wide v0
.end method

.method public static bridge synthetic IO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXO:F

    return p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/graphics/Bitmap;Ljava/lang/Integer;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    new-instance p2, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/graphics/Bitmap;)V

    const-wide/16 p0, 0x0

    const-string v0, ""

    invoke-static {v0, p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/r56;->O00(Ljava/lang/String;Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii1iii0()V

    return-void
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X00XIX1:I

    return p0
.end method

.method public static bridge synthetic OII(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    return-void
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    return-wide v0
.end method

.method public static bridge synthetic OIi0(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->i0X000X0O:I

    return p0
.end method

.method public static bridge synthetic OX(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOiXi11II:J

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXIIO1i11()V

    return-void
.end method

.method public static bridge synthetic OiIIX101O(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    return-void
.end method

.method public static bridge synthetic X01IiOiIi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setPlayPauseViewIcon(Z)V

    return-void
.end method

.method public static bridge synthetic X0O(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X100O:Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;

    return-object p0
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    return-wide v0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiiO()V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/widget/FrameLayout$LayoutParams;Landroid/animation/ValueAnimator;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p1, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiIOiX:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "----onAnimationUpdate--->>>>>>>"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/media/MediaPlayer;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11I(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static bridge synthetic XX0(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->i0X000X0O:I

    return-void
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic XiOIO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XO0X10iO:Z

    return-void
.end method

.method public static bridge synthetic XiOIii1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    return-void
.end method

.method private getRestoreState()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XX1Oi:Z

    return v0
.end method

.method public static bridge synthetic iIiiO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->i11I:Z

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1IX()V

    return-void
.end method

.method public static bridge synthetic iOOX010X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011(J)V

    return-void
.end method

.method private setPlayPauseViewIcon(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "isPlaying"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXX11i:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    const p1, 0x7f081084

    goto :goto_0

    :cond_0
    const p1, 0x7f081085

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public IXXOO(III)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "width",
            "height",
            "totalCount"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0i:I

    iput p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IXI:I

    iput p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IiiXiI0I:I

    return-void
.end method

.method public final Ii1iii0()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiIOiX:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateVideoProgress currentPosition = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXX11i()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iX1O1()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X00Xi1X:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOO0XOOii:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final O001I()V
    .locals 2

    const v0, 0x7f0a0203

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gg6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/gg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a03d0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hg6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/hg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ig6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ig6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jg6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/jg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXX11i:Landroid/widget/ImageView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kg6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/kg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public O1O(Landroid/net/Uri;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "videoURI"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii1iii0:Landroid/net/Uri;

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->setVideoURI(Landroid/net/Uri;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->O001I:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f14149f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final X0i1O()V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v1, Lcom/android/mltcode/paycertificationapi/ag6;->XOO0ii0:I

    int-to-float v2, v1

    iget-wide v3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    iget-wide v5, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOiXi11II:J

    sub-long/2addr v3, v5

    long-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiiiO:F

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float v1, v1

    iget-wide v7, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    sub-long/2addr v7, v5

    long-to-float v3, v7

    mul-float/2addr v3, v4

    add-float/2addr v1, v3

    float-to-int v1, v1

    filled-new-array {v2, v1}, [I

    move-result-object v1

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    iget-wide v4, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOiXi11II:J

    sub-long/2addr v2, v4

    iget-wide v6, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    sub-long/2addr v6, v4

    sub-long/2addr v2, v6

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXiIiX10:Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXiIiX10:Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/fg6;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/fg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/widget/FrameLayout$LayoutParams;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXiIiX10:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final X11I(Landroid/media/MediaPlayer;)V
    .locals 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mp"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iX1O1:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iX1O1:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    if-le p1, v1, :cond_0

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    :cond_0
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float p1, p1

    int-to-float v1, v1

    div-float/2addr p1, v1

    int-to-float v1, v2

    mul-float/2addr v1, p1

    float-to-int p1, v1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {p1}, Landroid/widget/VideoView;->getDuration()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11I:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->getRestoreState()Z

    move-result p1

    if-nez p1, :cond_1

    iget-wide v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    long-to-int p1, v1

    int-to-long v1, p1

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011(J)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setRestoreState(Z)V

    iget-wide v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    long-to-int p1, v1

    int-to-long v1, p1

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011(J)V

    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOO1ii1()V

    iget-object v4, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    iget-object v5, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii1iii0:Landroid/net/Uri;

    iget v6, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0X0X:I

    iget p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11I:I

    int-to-long v9, p1

    const-wide/16 v7, 0x0

    move-object v3, p0

    invoke-virtual/range {v3 .. v10}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiiiO(Landroid/content/Context;Landroid/net/Uri;IJJ)V

    iget-object p1, v3, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v1, v3, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0i:I

    iget v2, v3, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IXI:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXO(Landroid/content/Context;Landroid/graphics/Bitmap;II)V

    return-void
.end method

.method public final X11iII1O1()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setPlayPauseViewIcon(Z)V

    return-void
.end method

.method public final X1IX()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOX0O0:J

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXX11i()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIXi1iiXI()V

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setPlayPauseViewIcon(Z)V

    return-void
.end method

.method public final XXIIO1i11()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiiO:Lcom/android/mltcode/paycertificationapi/zf6;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/zf6;->onCancel()V

    return-void
.end method

.method public final XXO(Landroid/content/Context;Landroid/graphics/Bitmap;II)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "bitmap",
            "cropW",
            "cropH"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiIOiX:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showCropView -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/tmp.png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p2, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Z

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".imagepicker.provider"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    new-instance p2, Lcom/github/gzuliyujiang/imagepicker/OXO1;

    invoke-direct {p2, p1}, Lcom/github/gzuliyujiang/imagepicker/OXO1;-><init>(Landroid/net/Uri;)V

    iget-object v0, p2, Lcom/github/gzuliyujiang/imagepicker/OXO1;->XIi00iiXO:Lcom/github/gzuliyujiang/imagepicker/CropImageOptions;

    invoke-virtual {v0}, Lcom/github/gzuliyujiang/imagepicker/CropImageOptions;->iO()V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/github/gzuliyujiang/imagepicker/OXO1;->OII(Z)Lcom/github/gzuliyujiang/imagepicker/OXO1;

    move-result-object v1

    sget-object v2, Lcom/github/gzuliyujiang/imagepicker/CropImageView$Guidelines;->ON_TOUCH:Lcom/github/gzuliyujiang/imagepicker/CropImageView$Guidelines;

    invoke-virtual {v1, v2}, Lcom/github/gzuliyujiang/imagepicker/OXO1;->X1ii(Lcom/github/gzuliyujiang/imagepicker/CropImageView$Guidelines;)Lcom/github/gzuliyujiang/imagepicker/OXO1;

    move-result-object v1

    sget-object v2, Lcom/github/gzuliyujiang/imagepicker/CropImageView$CropShape;->RECTANGLE:Lcom/github/gzuliyujiang/imagepicker/CropImageView$CropShape;

    invoke-virtual {v1, v2}, Lcom/github/gzuliyujiang/imagepicker/OXO1;->I0iXXO(Lcom/github/gzuliyujiang/imagepicker/CropImageView$CropShape;)Lcom/github/gzuliyujiang/imagepicker/OXO1;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Lcom/github/gzuliyujiang/imagepicker/OXO1;->II1Xi0(II)Lcom/github/gzuliyujiang/imagepicker/OXO1;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Lcom/github/gzuliyujiang/imagepicker/OXO1;->iO(II)Lcom/github/gzuliyujiang/imagepicker/OXO1;

    move-result-object p3

    invoke-virtual {p3, v0}, Lcom/github/gzuliyujiang/imagepicker/OXO1;->XO0O10(Z)Lcom/github/gzuliyujiang/imagepicker/OXO1;

    iget-object p2, p2, Lcom/github/gzuliyujiang/imagepicker/OXO1;->XIi00iiXO:Lcom/github/gzuliyujiang/imagepicker/CropImageOptions;

    iput-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IO0II0i:Lcom/github/gzuliyujiang/imagepicker/CropImageOptions;

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1:Lcom/github/gzuliyujiang/imagepicker/CropImageView;

    invoke-virtual {p3, p2}, Lcom/github/gzuliyujiang/imagepicker/CropImageView;->setCropImageOptions(Lcom/github/gzuliyujiang/imagepicker/CropImageOptions;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IXOIIIO:Landroid/net/Uri;

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1:Lcom/github/gzuliyujiang/imagepicker/CropImageView;

    invoke-virtual {p2, p1}, Lcom/github/gzuliyujiang/imagepicker/CropImageView;->setImageUriAsync(Landroid/net/Uri;)V

    return-void
.end method

.method public final XXX11i()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXiIiX10:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X00Xi1X:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOO0XOOii:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXiIiX10:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method public final i010I()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1IX:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public final iI()V
    .locals 17

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    iget-wide v3, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    iget-object v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    const-string v2, "The video is less than 1 second long"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v1}, Landroid/widget/VideoView;->pause()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/trim"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->deleteFilesInDir(Ljava/lang/String;)Z

    iget-object v3, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    iget-object v4, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii1iii0:Landroid/net/Uri;

    iget v6, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IiiXiI0I:I

    iget-wide v7, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    iget-wide v9, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    iget-object v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1:Lcom/github/gzuliyujiang/imagepicker/CropImageView;

    invoke-virtual {v1}, Lcom/github/gzuliyujiang/imagepicker/CropImageView;->getCropRect()Landroid/graphics/Rect;

    move-result-object v11

    iget-object v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v12

    iget-object v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v13

    iget v14, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0i:I

    iget v15, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IXI:I

    iget-object v1, v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiiO:Lcom/android/mltcode/paycertificationapi/zf6;

    move-object/from16 v16, v1

    invoke-static/range {v3 .. v16}, Lcom/android/mltcode/paycertificationapi/ag6;->O00(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;IJJLandroid/graphics/Rect;IIIILcom/android/mltcode/paycertificationapi/zf6;)V

    return-void
.end method

.method public final iIXi1iiXI()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXX11i()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X00Xi1X:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOO0XOOii:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final iOO1ii1()V
    .locals 14

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    iget v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11I:I

    int-to-long v1, v0

    const-wide/16 v3, 0x2710

    cmp-long v1, v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v5, 0xa

    if-gtz v1, :cond_1

    iput v5, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0X0X:I

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    goto :goto_0

    :cond_1
    int-to-float v0, v0

    mul-float/2addr v0, v2

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0X0X:I

    iput-wide v3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1IX:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;

    sget v6, Lcom/android/mltcode/paycertificationapi/ag6;->XOO0ii0:I

    iget v7, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0X0X:I

    invoke-direct {v1, v6, v7}, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;-><init>(II)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    new-instance v8, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    iget-object v9, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    iget-wide v10, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    iget-wide v12, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    invoke-direct/range {v8 .. v13}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;-><init>(Landroid/content/Context;JJ)V

    iput-object v8, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    invoke-virtual {v8, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setSelectedMinValue(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    iget-wide v6, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    invoke-virtual {v0, v6, v7}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setSelectedMaxValue(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    iget-wide v6, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    iget-wide v8, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    invoke-virtual {v0, v6, v7, v8, v9}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O10IXXX0X(JJ)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    const-wide/16 v6, 0x3e8

    invoke-virtual {v0, v6, v7}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setMinShootTime(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNotifyWhileDragging(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOIX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setOnRangeSeekBarChangeListener(Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIXi1iiXI:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0i1O:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->Ii0X0X:I

    add-int/lit8 v1, v0, -0xa

    if-lez v1, :cond_2

    iget v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11I:I

    int-to-long v6, v1

    sub-long/2addr v6, v3

    long-to-float v1, v6

    sub-int/2addr v0, v5

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXO:F

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXO:F

    :goto_1
    iget v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IO:I

    int-to-float v0, v0

    mul-float/2addr v0, v2

    iget-wide v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OO:J

    iget-wide v3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    sub-long/2addr v1, v3

    long-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiiiO:F

    return-void
.end method

.method public final iX(Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d10aa

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a068e

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iX1O1:Landroid/widget/RelativeLayout;

    const p1, 0x7f0a18f6

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    const p1, 0x7f0a0455

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXX11i:Landroid/widget/ImageView;

    const p1, 0x7f0a0a05

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIXi1iiXI:Landroid/widget/LinearLayout;

    const p1, 0x7f0a0963

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    const p1, 0x7f0a18f7

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->O001I:Landroid/widget/TextView;

    const p1, 0x7f0a18f3

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1IX:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance p1, Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X100O:Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1IX:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1IX:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOXiX0:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->O001I()V

    const p1, 0x7f0a02bb

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/gzuliyujiang/imagepicker/CropImageView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1:Lcom/github/gzuliyujiang/imagepicker/CropImageView;

    return-void
.end method

.method public iX1O1()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setPlayPauseViewIcon(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final iXiX011(J)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "msec"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X11iII1O1:Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    long-to-int v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    sget-object v0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiIOiX:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "seekTo = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final iXiiiO(Landroid/content/Context;Landroid/net/Uri;IJJ)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "videoUri",
            "totalThumbsCount",
            "startPosition",
            "endPosition"
        }
    .end annotation

    new-instance v7, Lcom/android/mltcode/paycertificationapi/eg6;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/eg6;-><init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move-wide v3, p4

    move-wide v5, p6

    invoke-static/range {v0 .. v7}, Lcom/android/mltcode/paycertificationapi/ag6;->XO0O10(Landroid/content/Context;Landroid/net/Uri;IJJLcom/android/mltcode/paycertificationapi/zi4;)V

    return-void
.end method

.method public final iiiO()V
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX110i:J

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiX011(J)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setPlayPauseViewIcon(Z)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const/4 v0, 0x1

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/I11ii01;->XO0O10(Ljava/lang/String;Z)V

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/r56;->XIi00iiXO(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X00Xi1X:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XOO0XOOii:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setOnTrimVideoListener(Lcom/android/mltcode/paycertificationapi/zf6;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onTrimVideoListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iiiO:Lcom/android/mltcode/paycertificationapi/zf6;

    return-void
.end method

.method public setRestoreState(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "fromRestore"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XX1Oi:Z

    return-void
.end method
