.class public final Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public IO(Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 2

    const-string v0, "sportData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->access$getType$p(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;)Lcom/sma/smartv3/ui/sport/SportDataType;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "type"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-static {v0, v1, p1}, Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;->access$showItemValue(Lcom/sma/smartv3/ui/sport/SportShowDataSelectActivity;Lcom/sma/smartv3/ui/sport/SportDataType;Lcom/sma/smartv3/db/entity/SportData;)V

    return-void
.end method

.method public bridge O00(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->O00(Z)V

    return-void
.end method

.method public bridge OIi0(Lcom/sma/smartv3/db/entity/Location;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->OIi0(Lcom/sma/smartv3/db/entity/Location;)V

    return-void
.end method

.method public bridge XO0O10(Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->XO0O10(Lcom/szabh/smable3/entity/BleAppSportState;)V

    return-void
.end method

.method public bridge iO(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->iO(I)V

    return-void
.end method
