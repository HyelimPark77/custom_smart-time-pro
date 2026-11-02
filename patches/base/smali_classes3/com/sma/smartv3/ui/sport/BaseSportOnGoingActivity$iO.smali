.class public final Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/SportEndProgress$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$iO;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public end()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$iO;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->stopSport(Z)V

    return-void
.end method
