.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->syncDial(IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

.field public final synthetic XIi00iiXO:Ljava/io/File;

.field public final synthetic XO0O10:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

.field public final synthetic iO:Lcom/sma/smartv3/view/ProgressButtonV2;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/WatchFaceCategoryV2;Ljava/io/File;Lcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->XIi00iiXO:Ljava/io/File;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->iO:Lcom/sma/smartv3/view/ProgressButtonV2;

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->XO0O10:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "syncDial -> dial try get from net"

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getBinUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->getLength(Ljava/io/File;)J

    move-result-wide v5

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->OXO1:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WatchFaceCategoryV2;->getId()I

    move-result v8

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/sma/smartv3/biz/StatManager;->XO0O10(Ljava/lang/String;JII)V

    iget-object v9, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->iO:Lcom/sma/smartv3/view/ProgressButtonV2;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const v10, 0x7f1412fd

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->XO0O10:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$sendDial(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 10

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->XIi00iiXO:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->XO0O10:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    sget-object v0, Lcom/sma/smartv3/model/SyncStatus;->FAILED:Lcom/sma/smartv3/model/SyncStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncStatus$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;Lcom/sma/smartv3/model/SyncStatus;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->iO:Lcom/sma/smartv3/view/ProgressButtonV2;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const v2, 0x7f1412f9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$syncDial$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
