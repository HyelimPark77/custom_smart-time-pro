.class public Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iXiiiO(Landroid/content/Context;Landroid/net/Uri;IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

.field public final synthetic IO:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Landroid/graphics/Bitmap;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$bitmap"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;->I1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    iput-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;->IO:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;->I1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X0O(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$OXO1;->IO:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/trim/VideoTrimmerAdapter;->addBitmaps(Landroid/graphics/Bitmap;)V

    return-void
.end method
