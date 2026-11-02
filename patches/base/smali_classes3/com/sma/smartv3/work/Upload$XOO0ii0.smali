.class public final Lcom/sma/smartv3/work/Upload$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/p96;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/work/Upload;->OIX0iXi(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/p96<",
        "Lcom/sma/smartv3/db/entity/Location;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/db/dao/LocationDao;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/db/dao/LocationDao;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/work/Upload$XOO0ii0;->OXO1:Lcom/sma/smartv3/db/dao/LocationDao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/work/Upload$XOO0ii0;->OXO1:Lcom/sma/smartv3/db/dao/LocationDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/LocationDao;->update(Ljava/util/List;)I

    return-void
.end method

.method public getList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/work/Upload$XOO0ii0;->OXO1:Lcom/sma/smartv3/db/dao/LocationDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/LocationDao;->getListASC()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
