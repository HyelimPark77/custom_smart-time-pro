.class public final synthetic Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

.field public final synthetic X11iII1O1:Lcom/sma/smartv3/view/ProgressButtonV2;

.field public final synthetic XXX11i:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

.field public final synthetic iX1O1:I


# direct methods
.method public synthetic constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->IO:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iput p2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->I1:I

    iput p3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->iX1O1:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->X11iII1O1:Lcom/sma/smartv3/view/ProgressButtonV2;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->XXX11i:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->IO:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

    iget v1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->I1:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->iX1O1:I

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->X11iII1O1:Lcom/sma/smartv3/view/ProgressButtonV2;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/OXO1;->XXX11i:Lcom/sma/smartv3/model/WatchFaceCategoryV2;

    move-object v5, p1

    check-cast v5, Lcom/sma/smartv3/model/AccountCreateOrder;

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1;->O00(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;IILcom/sma/smartv3/view/ProgressButtonV2;Lcom/sma/smartv3/model/WatchFaceCategoryV2;Lcom/sma/smartv3/model/AccountCreateOrder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
