.class public final Lcom/sma/smartv3/initializer/BleInitializer$XXI;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReadEcg(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleEcg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleEcg;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$XXI;->IO:Ljava/util/List;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$XXI;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 3

    .line 2
    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->O001I(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    move-result-object v1

    invoke-interface {v1}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;->getLastElectrocardiogram()Lcom/sma/smartv3/db/entity/Electrocardiogram;

    move-result-object v1

    .line 3
    invoke-static {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->O001I(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/initializer/BleInitializer$XXI;->IO:Ljava/util/List;

    invoke-static {v2, v1}, Lcom/android/mltcode/paycertificationapi/X01X0;->iO(Ljava/util/List;Lcom/sma/smartv3/db/entity/Electrocardiogram;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;->insert(Ljava/util/List;)[J

    const/4 v0, 0x2

    .line 4
    const-string v1, "heart_rate_change"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v2
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$XXI;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
