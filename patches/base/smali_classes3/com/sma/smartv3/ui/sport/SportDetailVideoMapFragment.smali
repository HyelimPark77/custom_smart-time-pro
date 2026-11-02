.class public final Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;
.super Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;",
        "Lcom/android/mltcode/paycertificationapi/h0<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportDetailVideoMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,637:1\n1878#2,3:638\n*S KotlinDebug\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n*L\n503#1:638,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportDetailVideoMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,637:1\n1878#2,3:638\n*S KotlinDebug\n*F\n+ 1 SportDetailVideoMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailVideoMapFragment\n*L\n503#1:638,3\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnSaveVideo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final hrLineChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivAvatar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llHr$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEndTime:J

.field private mFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFrameRate:I

.field private final mHeartRateDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMaxSize:I

.field private mStartTime:J

.field private mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private nextIndex:I

.field private playEndJump:Z

.field private rootBitmap:Landroid/graphics/Bitmap;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private trackPlayProcess:F

.field private final tvAvgHrValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDetailname$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNickname$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private videoProcess:F

.field private videoStart:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;-><init>()V

    const-string v0, "SportDetailVideoMapFragment"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->ivAvatar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvNickname$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvDetailname$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->hrLineChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->llHr$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lz4;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/lz4;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mHeartRateDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvAvgHrValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->btnSaveVideo$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->OO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v2

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mapVideo"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".mp4"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    const/16 v0, 0x28

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFrameRate:I

    new-instance v0, Lcom/sma/smartv3/ui/sport/TrackPlay;

    new-instance v1, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/TrackPlay;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;

    const v0, 0x7f081377

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMStartIcon(I)V

    const v0, 0x7f081374

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMCurrentIcon(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setEndMarkerAnchorCenter(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setGradient(Z)V

    const v0, 0x7f060710

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMMapLineColor(I)V

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playTrack$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    return-void
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->setLoadingProcess$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    return-void
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FLandroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mapSnapShot$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FLandroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->llHr_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mHeartRateDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvDetailname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoFinish$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    return-void
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvNickname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->btnSaveVideo_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private final avatarShow()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f081568

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->XOO0ii0(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v1

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method private static final btnSaveVideo_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a33

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final configChart(Lcom/github/mikephil/charting/charts/LineChart;II)V
    .locals 12

    iget-wide v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mEndTime:J

    iget-wide v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mStartTime:J

    sub-long/2addr v0, v2

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr v0, v2

    const/16 v4, 0x3c

    int-to-long v4, v4

    div-long/2addr v0, v4

    sget-object v6, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-virtual {v6, p1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XIi00iiXO(Lcom/github/mikephil/charting/charts/LineChart;)V

    const/4 v7, 0x0

    invoke-virtual {p1, v7}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v8

    int-to-float p3, p3

    invoke-virtual {v8, p3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p3

    int-to-float p2, p2

    invoke-virtual {p3, p2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p3

    const v8, 0x7f06024d

    invoke-static {p3, v8}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XX1Oi(I)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-static {p3, v8}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->I0IIOi(I)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lcom/github/mikephil/charting/components/YAxis;->iI0I(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p2, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p2, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p2, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v8, "getContext(...)"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p2, v7, p1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    invoke-virtual {p2, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p2, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {p2, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    long-to-float p1, v0

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    const/4 p1, 0x0

    invoke-static {v7, p3, p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object p1

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v6, 0x0

    cmp-long v8, v6, v0

    if-gtz v8, :cond_0

    :goto_0
    iget-wide v8, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mStartTime:J

    mul-long v10, v6, v4

    mul-long/2addr v10, v2

    add-long/2addr v8, v10

    invoke-static {v8, v9, p1}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "millis2String(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    cmp-long v8, v6, v0

    if-eqz v8, :cond_0

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p1, p3}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    return-void
.end method

.method private final dismissLoadPopup()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-void
.end method

.method public static synthetic generateVideo$default(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo(F)V

    return-void
.end method

.method private final getBtnSaveVideo()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->btnSaveVideo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getHrLineChart()Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->hrLineChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/LineChart;

    return-object v0
.end method

.method private final getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->ivAvatar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object v0
.end method

.method private final getLlHr()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->llHr$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMHeartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mHeartRateDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/HeartRateDao;

    return-object v0
.end method

.method private final getTvAvgHrValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvAvgHrValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDetailname()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvDetailname$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvNickname()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvNickname$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final hrLineChart_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0442

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/mikephil/charting/charts/LineChart;

    return-object p0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->tvAvgHrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->initView$lambda$0$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    return-void
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FLandroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mapSnapShot$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FLandroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->hrLineChart_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    return-object p0
.end method

.method private final initCanvasImage(Landroid/graphics/Bitmap;FF)V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p3

    float-to-int v0, v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p3

    float-to-int v1, v1

    rem-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    :cond_0
    rem-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, -0x1

    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v1, p3, p3}, Landroid/graphics/Matrix;->setScale(FF)V

    new-instance p3, Landroid/graphics/Canvas;

    invoke-direct {p3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v2, 0x0

    invoke-virtual {p3, p1, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    if-nez p1, :cond_2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v3

    const-string v4, "<get-rootView>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p3, p1, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mMaxSize:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mMaxSize:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p2, p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->XOX0O0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    sget-object p2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {v0, p1, p2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    :cond_4
    return-void
.end method

.method public static synthetic initCanvasImage$default(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;Landroid/graphics/Bitmap;FFILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->initCanvasImage(Landroid/graphics/Bitmap;FF)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    const/16 v0, 0x8

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playEndJump:Z

    :try_start_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playTrack()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getBtnSaveVideo()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mapSnapShot(F)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a060f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object p0
.end method

.method private static final llHr_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a06f7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mHeartRateDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v0

    return-object v0
.end method

.method private final mapSnapShot(F)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oz4;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/oz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;F)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pz4;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/pz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;F)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private static final mapSnapShot$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FLandroid/graphics/Bitmap;)V
    .locals 1

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v0, 0x3f4ccccd    # 0.8f

    invoke-direct {p0, p2, p1, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->initCanvasImage(Landroid/graphics/Bitmap;FF)V

    return-void
.end method

.method private static final mapSnapShot$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FLandroid/graphics/Bitmap;)V
    .locals 1

    if-eqz p2, :cond_0

    const v0, 0x3f4ccccd    # 0.8f

    invoke-direct {p0, p2, p1, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->initCanvasImage(Landroid/graphics/Bitmap;FF)V

    :cond_0
    return-void
.end method

.method private static final playTrack$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo$default(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-static {}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->zoomOut()Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v1

    const/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapapi/map/BaiduMap;->animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomOut()Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    const/16 v3, 0x1f4

    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;ILcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    :goto_0
    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->playTrack()V

    return-void
.end method

.method private static final setLoadingProcess$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 4

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->trackPlayProcess:F

    iget v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoProcess:F

    add-float/2addr v0, v1

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v1, :cond_1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, v0, v2

    if-ltz v2, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->dismissLoadPopup()V

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playEndJump:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playEndJump:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v2

    if-eqz v2, :cond_1

    const v2, 0x7f140c47

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x64

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "%"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/uq;->iOOX010X(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private final showHr(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mStartTime:J

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v0

    const v2, 0xea60

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mEndTime:J

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-wide v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mStartTime:J

    iget-wide v3, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mEndTime:J

    const-wide/32 v5, 0xea60

    invoke-static/range {v1 .. v6}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    new-instance v6, Lcom/android/mltcode/paycertificationapi/nr0;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/nr0;-><init>(IILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const-wide/32 v5, 0xea60

    add-long/2addr v1, v5

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v3, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/mltcode/paycertificationapi/nr0;

    sget-object v8, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v8

    cmp-long v6, v8, v6

    if-gtz v6, :cond_2

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v2

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v5, v2}, Lcom/android/mltcode/paycertificationapi/nr0;->OIX0iXi(I)V

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v5, v2}, Lcom/android/mltcode/paycertificationapi/nr0;->OIi0(I)V

    :cond_3
    move v2, v4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/high16 v2, -0x40800000    # -1.0f

    const/4 v3, 0x0

    move v5, v2

    move v4, v3

    move v3, v1

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v7

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v6

    div-int/2addr v7, v6

    new-instance v6, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v9, v7

    invoke-direct {v6, v4, v9}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v3, v7, :cond_5

    add-float/2addr v5, v8

    move v3, v7

    :cond_5
    add-int/2addr v1, v7

    :cond_6
    add-float/2addr v4, v8

    goto :goto_2

    :cond_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    div-int/2addr v1, v0

    :cond_8
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v0

    if-lez v0, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v0

    if-le v0, v3, :cond_9

    cmpl-float v0, v5, v2

    if-lez v0, :cond_9

    float-to-int v0, v5

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->I0IIOi(F)V

    :cond_9
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getHrLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    const-string v1, "<get-hrLineChart>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v2, v2, 0xa

    const/16 v3, 0x28

    invoke-direct {p0, v0, v3, v2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->configChart(Lcom/github/mikephil/charting/charts/LineChart;II)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getHrLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f060236

    const v2, 0x7f0816d1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V

    return-void
.end method

.method private final showLoadPopup()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    const v1, 0x7f140c47

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "0%"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;->iOOX010X(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final tvAvgHrValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c97

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDetailname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c6a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvNickname_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0349

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/mikephil/charting/charts/LineChart;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;II)V"
        }
    .end annotation

    new-instance v0, Lcom/github/mikephil/charting/data/LineDataSet;

    const-string v1, ""

    invoke-direct {v0, p2, v1}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-static {p2, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-static {p2, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    const/high16 p2, 0x40000000    # 2.0f

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {v0, p2}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    const/4 p3, 0x1

    invoke-virtual {v0, p3}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    sget-object v1, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->CUBIC_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, p4}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.Drawable"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    new-instance p4, Lcom/android/mltcode/paycertificationapi/co;

    new-array p3, p3, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object v0, p3, p2

    invoke-direct {p4, p3}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {p4, p2}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-virtual {p1, p4}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    const/16 p2, 0x3e8

    invoke-virtual {p1, p2}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private static final videoFinish$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getBtnSaveVideo()Landroid/widget/Button;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final generateVideo(F)V
    .locals 2

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->trackPlayProcess:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoFinish()V

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mapSnapShot(F)V

    :cond_1
    if-nez v0, :cond_2

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->nextIndex:I

    new-instance p1, Lcom/android/mltcode/paycertificationapi/ye6;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFrameRate:I

    invoke-direct {p1, p0, v0, v1}, Lcom/android/mltcode/paycertificationapi/ye6;-><init>(Lcom/android/mltcode/paycertificationapi/h0;Ljava/io/File;I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/ye6;->I1XOi1()V

    :cond_2
    return-void
.end method

.method public final getMFile()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    return-object v0
.end method

.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    return-object v0
.end method

.method public final getMMaxSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mMaxSize:I

    return v0
.end method

.method public getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;

    return-object v0
.end method

.method public final getNextIndex()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->nextIndex:I

    return v0
.end method

.method public final getPlayEndJump()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playEndJump:Z

    return v0
.end method

.method public final getRootBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTrackPlayProcess()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->trackPlayProcess:F

    return v0
.end method

.method public final getVideoProcess()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoProcess:F

    return v0
.end method

.method public final getVideoStart()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    return v0
.end method

.method public initView()V
    .locals 6

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView()V

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->OO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v2

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mapVideo"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".mp4"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getBtnSaveVideo()Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getTvDetailname()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getTvNickname()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->avatarShow()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getTvAvgHrValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgBpm()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getBtnSaveVideo()Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ez4;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/ez4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getMHeartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/o65;->O00(Lcom/sma/smartv3/db/entity/Workout;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->showHr(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getLlHr()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getHrLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->showHr(Ljava/util/List;)V

    return-void
.end method

.method public initializedMapFinish()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapType(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/BaiduMap;->getUiSettings()Lcom/baidu/mapapi/map/UiSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/UiSettings;->setAllGesturesEnabled(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomOut()Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e87

    return v0
.end method

.method public next()Landroid/graphics/Bitmap;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .line 2
    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->nextIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->nextIndex:I

    .line 3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->nextIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->next()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public playTrack()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->OIX0iXi()I

    move-result v0

    const/16 v1, 0x15

    if-ltz v0, :cond_0

    if-ge v0, v1, :cond_0

    div-int/lit8 v1, v0, 0x3

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFrameRate:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v1

    const/16 v2, 0xbb8

    div-int/2addr v2, v0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XiOIii1(I)V

    goto :goto_0

    :cond_0
    if-gt v1, v0, :cond_1

    const/16 v1, 0x65

    if-ge v0, v1, :cond_1

    div-int/lit8 v1, v0, 0x5

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFrameRate:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v1

    const/16 v2, 0x1388

    div-int/2addr v2, v0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XiOIii1(I)V

    goto :goto_0

    :cond_1
    div-int/lit8 v1, v0, 0xa

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFrameRate:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v1

    const/16 v2, 0x2710

    div-int/2addr v2, v0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->XiOIii1(I)V

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFrameRate:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  playTrack size = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  mFrameRate = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->getBtnSaveVideo()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    const/4 v1, 0x0

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->trackPlayProcess:F

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoProcess:F

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mMaxSize:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->showLoadPopup()V

    :cond_2
    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->generateVideo$default(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;FILjava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fz4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/fz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    const-wide/16 v2, 0x96

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public progress(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoProcess:F

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->setLoadingProcess()V

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoFinish()V

    :cond_0
    return-void
.end method

.method public final setLoadingProcess()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dz4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/dz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final setMFile(Ljava/io/File;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mFile:Ljava/io/File;

    return-void
.end method

.method public final setMMaxSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mMaxSize:I

    return-void
.end method

.method public setMTrackPlay(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/TrackPlay;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;

    return-void
.end method

.method public final setNextIndex(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->nextIndex:I

    return-void
.end method

.method public final setPlayEndJump(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->playEndJump:Z

    return-void
.end method

.method public final setRootBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->rootBitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final setTrackPlayProcess(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->trackPlayProcess:F

    return-void
.end method

.method public final setVideoProcess(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoProcess:F

    return-void
.end method

.method public final setVideoStart(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->videoStart:Z

    return-void
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;->mMaxSize:I

    add-int/lit8 v0, v0, 0x5

    return v0
.end method

.method public final videoFinish()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gz4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/gz4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailVideoMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
