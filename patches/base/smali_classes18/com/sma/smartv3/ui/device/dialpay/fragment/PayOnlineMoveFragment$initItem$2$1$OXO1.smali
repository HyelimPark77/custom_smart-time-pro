.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXiIO0i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

.field public final synthetic XIi00iiXO:I

.field public final synthetic XO0O10:Lcom/sma/smartv3/view/ProgressButtonV2;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iput p2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->XIi00iiXO:I

    iput p3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->iO:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->XO0O10:Lcom/sma/smartv3/view/ProgressButtonV2;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->XIi00iiXO:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncDialId$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->iO:I

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncPosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$setMCurSyncDevicePosition$p(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->XO0O10:Lcom/sma/smartv3/view/ProgressButtonV2;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setMCurProgressButton(Lcom/sma/smartv3/view/ProgressButtonV2;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->setMCurItem(Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget v3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->XIi00iiXO:I

    iget v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->iO:I

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->XO0O10:Lcom/sma/smartv3/view/ProgressButtonV2;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1$OXO1;->O00:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move v5, p1

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;->access$syncDial(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IIILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V

    return-void
.end method
