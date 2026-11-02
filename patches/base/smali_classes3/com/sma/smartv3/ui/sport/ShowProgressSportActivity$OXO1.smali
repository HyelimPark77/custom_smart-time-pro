.class public final Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/NewSportButtonProgress$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->setButtonProgress()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportPause()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->sportResume()V

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->access$setSportEndProgressImage(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V

    return-void
.end method
