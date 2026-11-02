.class public final Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/szabh/smable3/music/MusicControllerCompat;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/szabh/smable3/music/MusicControllerCompat;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/music/MusicControllerCompat;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;->this$0:Lcom/szabh/smable3/music/MusicControllerCompat;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x73abbf83

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "android.media.VOLUME_CHANGED_ACTION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "android.media.EXTRA_VOLUME_STREAM_TYPE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;->this$0:Lcom/szabh/smable3/music/MusicControllerCompat;

    invoke-virtual {p1}, Lcom/szabh/smable3/music/MusicControllerCompat;->updateVolume()V

    :cond_1
    :goto_0
    return-void
.end method
