.class public Lcom/sma/smartv3/ui/trim/view/ZVideoView;
.super Landroid/widget/VideoView;
.source "SourceFile"


# instance fields
.field public I1:I

.field public IO:I

.field public X11iII1O1:I

.field public iX1O1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x1e0

    .line 2
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->IO:I

    .line 3
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->I1:I

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->iX1O1:I

    .line 5
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->X11iII1O1:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
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

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x1e0

    .line 7
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->IO:I

    .line 8
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->I1:I

    const/4 p1, 0x1

    .line 9
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->iX1O1:I

    .line 10
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->X11iII1O1:I

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

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x1e0

    .line 12
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->IO:I

    .line 13
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->I1:I

    const/4 p1, 0x1

    .line 14
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->iX1O1:I

    .line 15
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->X11iII1O1:I

    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "widthMeasureSpec",
            "heightMeasureSpec"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/widget/VideoView;->onMeasure(II)V

    return-void
.end method

.method public setVideoURI(Landroid/net/Uri;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "uri"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/16 p1, 0x13

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->X11iII1O1:I

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/ZVideoView;->iX1O1:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method
