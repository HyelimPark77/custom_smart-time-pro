.class public final Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/bestmafen/baseble/scanner/BleDevice;)Z
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;->access$getRssi$p(Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;)I

    move-result v0

    neg-int v0, v0

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
