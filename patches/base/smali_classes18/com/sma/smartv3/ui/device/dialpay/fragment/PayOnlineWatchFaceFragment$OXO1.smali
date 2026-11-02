.class public final Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->findData(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;",
            "Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;->OXO1:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;->XIi00iiXO:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;->OXO1:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/OnlineWatchFaceV2;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment$OXO1;->XIi00iiXO:Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/OnlineWatchFaceV2;->getTypeId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;->access$onClickMove(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment;Lcom/sma/smartv3/model/OnlineWatchFaceV2;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
