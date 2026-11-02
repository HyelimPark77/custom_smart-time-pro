.class public final Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXiIO0i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;->findData(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IiI10X:Lcom/sma/smartv3/model/OnlineWatchFaceV2;

.field public final synthetic O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

.field public final synthetic XIi00iiXO:I

.field public final synthetic XO0O10:Lcom/sma/smartv3/view/ProgressButton;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/model/OnlineWatchFaceV2;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

    iput p2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->XIi00iiXO:I

    iput p3, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->iO:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->XO0O10:Lcom/sma/smartv3/view/ProgressButton;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iput-object p6, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->IiI10X:Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;

    iget v1, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->XIi00iiXO:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->iO:I

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->XO0O10:Lcom/sma/smartv3/view/ProgressButton;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment$XIi00iiXO;->IiI10X:Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    move v3, p1

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;->access$syncDial(Lcom/sma/smartv3/ui/device/watchface/fragment/OnlineWatchFaceFragment;IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceCategoryV2;I)V

    return-void
.end method
